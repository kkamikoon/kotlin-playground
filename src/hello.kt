import kotlin.reflect.typeOf

fun helloKotlin(){
    println("Hello Kotlin!")
}

fun expression(){
    println("Chapter01 - Expression")
    53 + 62 - 126

    println(53 + 62 - 126)

    53 + 62 -
    126

    println(53 +
            62 -
            126)
}

fun variable(){
    println("Chapter01 - Variable")
    var total: Int
    total = 0

    val a: Int = 10 + 53 - 7
    println(a)

    val b: Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)
}

fun literalDataType(){
    println("Chapter01 - Literal Data Type")
    val variable = 10 + 12 - 5
    println(variable)
}

fun arithmeticOperator(){
    println("Chapter01 - Arithmetic Operator")
    val num: Int = 15 - 4 * 3
    val num2: Int = 65 % 7
    val num3: Double = 7.5 / 5 + 22.25
    val num4: Double = num / num2 + 0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)

    val num5: Double = num.toDouble() / num2 + 0.7
    println(num5)
}

fun incrementAndDecrementOperator(){
    println("Chapter01 - Increment & Decrement Operator")
    var a = 10
    var b = 5

    println(a++ + b)
    println(a)
    println(--b)
}

fun bitwiseOperator(){
    println("Chapter01 - Bitwise Operator")
    println(15 and 7) // 15 & 7
    println(5 or 2)
    println(15 xor 5)
    println(32767.inv()) // inverse -32767
    println(1 shl 3) // shift left 3 -> 8
    println(8 shr 1) // shift right 1 -> 4
    println(-17 ushr 2) // shift right(same signed) 1073741819
}

fun integerAndRealDataType(){
    println("Chapter01 - Integer and Real Data Type")
    val a: Byte = 125
    val b: Short = (100 + 200) * 100
    var c: Int = 12_4354_6538
    c = 0xFF_88_88
    c = 0b01010010_01100011_01110101_01000101
    var d: Long = -543_7847_3984_7238_4723 // just to easy to understand long number.

    c = a + b
    d = c + 10L

    var e: Float = 67.6f
    var f: Double = 658.456
    e = (e + f).toFloat()
    println(e)
}