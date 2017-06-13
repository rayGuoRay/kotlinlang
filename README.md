# Kotlin Language

本项目相关示例旨在学习 Kotlin 语法，查看更多 Kotlin 相关内容请关注下列链接：

* [Kotlin Language 主页](http://kotlinlang.org/)
* [Kotlin 在线编程网址]( https://try.kotlinlang.org/#/Examples/Hello,%20world!/Simplest%20version/Simplest%20version.kt)
* [Kotlin 官方文档](http://kotlinlang.org/docs/reference/)
* [Kotlin 官方文档中文翻译](https://huanglizhuo.gitbooks.io/kotlin-in-chinese/content/Basics/Basic-Types.html)

## 编译运行
具体使用方式请参考<<[ 使用命令行编译运行 Kotlin ](http://blog.csdn.net/liangjiu2009/article/details/72518558)>>, OS X 下使用简单使用如下 :
- 使用 [Homebrew](https://brew.sh/) 安装 Kotlin : brew install kotlin
- 编译 : kotlinc hello.kt -include-runtime -d hello.jar
- 运行 : java -jar hello.jar

## 内容说明

结合[ BasicSyntax.md ](/BasicSyntax/BasicSyntax.md), 初步认识 Kotlin ,熟悉其基本语法,习惯用法以及代码风格。示例演示 :

- 简单计算器[ SimpleMath.kt ](/BasicSyntax/SimpleMath.kt)

结合[ ClassAndObject.md ](/ClassAndObject/ClassAndObject.md),了解类和对象在 Kotlin 中的写法以及注意事项。示例演示 :

- 简单电影院模型[ SimpleCinema.kt ](/ClassAndObject/SimpleCinema.kt)
