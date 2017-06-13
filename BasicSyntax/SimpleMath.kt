fun main(args: Array<String>) {
    if (args.size != 3) {
        printMessage()
        return
    }
    printMessage("The Simple Math Result Is ${simpleMath(args)}")
}

fun printMessage(errorMessage: String = "The Simple Math Is Error") {
    println(errorMessage)
}

fun simpleMath(args: Array<String>): Int {
    val paramTempA: Int? = args[0].toInt()
    val paramA = if (paramTempA == null) 0 else paramTempA
    val paramB = args[1]
    val paramTempC: Int? = args[2].toInt()
    val paramC = if (paramTempC == null) 0 else paramTempC
    when (paramB) {
        "+"  ->  return sumSimple(paramA, paramC)
        "-"  ->  return subSimple(paramA, paramC)
        "*"  ->  return mulSimple(paramA, paramC)
        "/"  ->  return divSimple(paramA, paramC)
        "%"  ->  return modSimple(paramA, paramC)
        else -> {
            printMessage("wrong operation")
            return -1
        }
    }
}

fun sumSimple(paramA: Int, paramB: Int) = paramA + paramB

fun subSimple(paramA: Int, paramB: Int) = paramA - paramB

fun mulSimple(paramA: Int, paramB: Int) = paramA * paramB

fun divSimple(paramA: Int, paramB: Int) = if (paramB != 0) paramA / paramB else -1

fun modSimple(paramA: Int, paramB: Int) = if (paramB !=0) paramA % paramB else -1
