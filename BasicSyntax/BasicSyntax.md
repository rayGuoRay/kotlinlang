### 包结构定义与包引入声明

        package my.demo

        import java.util.*

### 方法（函数）声明

        fun sum(a: Int, b: Int): Int {
            return a + b
        }

        fun sum(a: Int, b: Int): return a + b

### 变量声明

        var Mutable variable
        val Assign-once (read-only) local variable

        //val 类似于 Java 中的 final 声明的变量
        val a: Int = 1  // immediate assignment  
        val b = 2   // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided  
        c = 3       // deferre
        //声明中如果直接赋值，变量类型可以省略

        //right
        val a : Int
        a = 2
        println("$a")

        //wrong
        val a : Int = 2
        a = 3
        println("$a")

### 注释使用与Java相同，使用 // 或者 /*

### 字符串相关定义和使用

        var a = "Hello Ray World"
        val s1 = "Test Read Only $a"
        println("$s1")
        val s2 = s1.replace("Ray", "Our")
        println("$s1")
        println("$s2")

        //输出结果
        //Test Read Only Hello Ray World
        //Test Read Only Hello Ray World
        //Test Read Only Hello Our World

### 条件表达式（if）

        fun max1(a: Int, b: Int) : Int{
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }

        fun max2(a: Int, b: Int) = if (a > b) a else b

        //运行时报错，报错信息如下
        //Exception in thread "main" java.lang.ExceptionInInitializerError
        //at kotlin.reflect.jvm.ReflectLambdaKt.reflect(reflectLambda.kt:42)
        //at kotlin.reflect.jvm.internal.ReflectionFactoryImpl.renderLambdaToString(ReflectionFactoryImpl.java:55)
        //at kotlin.jvm.internal.Reflection.renderLambdaToString(Reflection.java:80)
        //at kotlin.jvm.internal.Lambda.toString(Lambda.kt:22)
        //at java.lang.String.valueOf(String.java:2982)
        //at java.lang.StringBuilder.append(StringBuilder.java:131)
        //at Simplest_versionKt.main(Simplest version.kt:28)
        fun max3(a: Int, b: Int) = {
            val at = a * 2
            val bt = b / 2
            if (at > bt) at else bt
        }

        fun main(args: Array<String>) {
            val a = 1;
            val b = 2;
            println("the max value of a and b is ${max1(a, b)}")
            println("the max value of a and b is ${max2(a, b)}")
            println("the max value of a and b is ${max3(a, b)}")
        }

### 重要特性：可为空的值的使用和检查是否为空

        //类型后面加?表示可为空
        var age: String? = "23"
        //抛出空指针异常
        val ages = age!!.toInt()
        //不做处理返回 null
        val ages1 = age?.toInt()
        //age为空返回-1
        val ages2 = age?.toInt() ?: -1
        //其中的”？“符号是可为空，”!!“是像Java一样抛出空异常，"?:"则是再进行判断”如果为空，则执行后面那句“。
        //此处不同于 Java 中的三目运算符   

### 类型检查和自动转换

        //使用 is 来检查是不是某种类型，类似 Java 中的 instanceof
        if (a is Sring) / if (a !is String)    

### 循环表达式 (for / while)、range、集合与Lamada表达式的使用

        fun exampleForLoop(item : List<Int>) {
            for (itemString in item) {
                println("Item String Is: $itemString")
            }

            for (itemIndex in item.indices) {
                println("Item String Is: ${item[itemIndex]}")
            }

            for ((itemIndex, itemValue) in item.withIndex()) {
                println("Item Index Is $itemIndex And Value Is $itemValue")
            }

            var index = 0;
            while (index < item.size) {
                println("Item String In While Loop Is ${item[index]}")
                index++
            }

            var indexRange = 0;
            for (indexRange in item) {
                println("Item Index Content: $indexRange")
            }

            var indexRange1 = 0;
            for (indexRange1 in 0..10 step 2) {
                println("Item Range1 is $indexRange");
            }
            for (indexRange1 in  10 downTo 0 step 3) {
                println("Item Range2 is $indexRange");
            }
        }

### when 表达式

        //类似于Java中的 switch case ，但是switch规则要更丰富
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }

        fun getType(obj: Any): String =
        when(obj) {
            1    ->   "Type 1"
        	2    ->   "Type 2"
            3    ->   "Type 3"
            else ->   "UnKnown"
        }
