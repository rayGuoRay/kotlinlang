### 类的声明

        class Entity {

        }

        //如果没有类体，花括号可以省略
        class Entity

### 类的构造函数

#### 主构造函数三种写法:

        class Person constructor (firstName: String) {
        }

        class Person (firstName: String) {
            //主构造函数＂constructor＂关键字可以省略
        }

        class Person (firstName: String) {
            init() {
                println("init value name is ${firstName}")
            }
        }

**特别注意,　如果构造函数与可见性和注解搭配使用，可见性关键字应该在＇constructor关键字之前＇**

        class Customer public @inject constructor (name: String) {...}

#### 二级构造函数:

        class Person {
            constructor (parent: Person) {
                parent.children.add(this)
            }
        }

        class Person(val name: String) {
            constructor (name: String, paret: Person) : this(name) {
                parent.children.add(this)
            }
        }

        //声明一个空的主构造函数,这种相当于 Java 中构造私有的构造方法
        class Person private constructor () {
        }

### 类的声明、继承与重写

Kotlin 中类的声明不需要使用　new 关键字，声明方法如下所示：

        var person = Person("test")
        var person = Person("test", 12)

Kotlin 中所有的类都隐式继承自 Any，Any 不是 java.lang.Object；事实上它除了 equals()，hashCode() 以及 toString() 外没有任何成员了。

而 open 注解与 java 中的 final 相反:它允许别的类继承这个类。默认情形下, Kotlin 中所有的类都是 final。

        class Base
        class Person : Base()

        open class Base(p: Int)
        class Derived(p: Int) : Base(p)

**如果类有主构造函数，则基类可以而且是必须在主构造函数中使用参数立即初始化。**

**如果类没有主构造函数，则必须在每一个构造函数中用 super 关键字初始化基类，或者在代理另一个构造函数做这件事。注意在这种情形中不同的二级构造函数可以调用基类不同的构造方法：**

Kotlin　中可以复写属性，方法，用 var 复写 val ,但是必须使用 override 关键字来声明。

        open class Base {
            open fun v() {}
            fun nv() {}
        }

        class Derived() : Base() {
            override fun v() {}
        }

        class C() : A() , B {
            override fun f() {
                super<A>.f() // 调用 A.f()
                super<B>.f() // 调用 B.f()
            }
        }

**特别地，对于抽象类来说，可以使用抽象成员来重写一个 open 方法**

        open class Base {
            open fun f() {}
        }

        abstract class Derived : Base() {
            override abstract fun f()
        }

### 伴随对象，密封类，数据对象和接口
