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

fun trapOfRealNumber(){
    println("Chapter01 - Trap of real number")
    println(0.1f + 0.1f + 0.1f)
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f +0.1f)
    println(0.1f * 10)
}

fun charType(){
    println("Chapter01 - Character Type")
    var ch: Char = 'A'
    println(ch)

    ch = '\uAC00'
    println(ch)

    ch = '한'
    println(ch.toInt())
}

fun stringType(){
    println("Chapter01 - String Type")
    var str: String = "Hello"
    println(str)

    str = str + "\nKotlin!"
    println(str)

    println(str[8])

    val num = 10 * 5 + 3
    println(str + num)

    str += (str + num)
    println(str)
    println(str[str.length-1])
}

fun expressionIntoString(){
    println("Chapter01 - Expression into string")
    val a = 10
    val b = 20

    println("A의 값 : $a")
    println("B의 값 : $b")

    println("A + B : ${a+b}")
}

typealias MyNumber = Int

fun typeAlias(){
    println("Chapter01 - Type Alias")
    val a: MyNumber = 10
    println(a)
}

fun assignmentOperator(){
    println("Chapter01 - Assignment Operator")
    val a: Int
    var b: Int

    a = 10 + 5
    b = 10

    b += a
    println(b)

    b %= 3
    println(b)
}

fun statement(){
    println("Chapter01 - Statement")

    val num: Int
    num = 15

    println(
        num + 7 * 3
    )
}

fun comparisonOperator(){
    println("Chapter01 - Comparison Operator")

    var isRight: Boolean = (10 + 70) > (3 * 25)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10 + 20)
    println(isRight)

    isRight = 0.00001f == 0.005f * 0.002f
    println("$isRight, ${0.00001f} == ${0.005f * 0.002f}")

    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight)
}

fun logicalOperator(){
    println("Chapter01 - Logical Operator")

    val a = 15
    val b = 17

    var bool: Boolean = (a-b<a+b) && (a == 15)
    println(bool)

    bool = !((a+b) > (a*3) || (b-a) > 0)
    println(bool)
}

fun conditionalStatementIf(){
    println("Chapter01 - Conditional Statement - if")
    var a = 15
    var b = 11

    if (a>b){
        println("Here is in the 'if'")
        a -= b
    }
    println(a)
}

fun conditionalStatementIfelse(){
    println("Chapter01 - Conditional Statement - if, else")
    val a = 10
    val b = 5

    if (a<b)
        println("if!!!")
    else
        println("else!!!")

    if (a>b)
        println("a > b !!!!")
    else
        println("a <= b !!!!!")
}

fun conditionalStatementNestedIfElse(){
    println("Chapter01 - Conditional Statement - nested if, else")
    val score = 88

    if (score >= 90){
        println("A")
    } else if (score >= 80){
        println("B")
    } else if (score >= 70) {
        println("C")
    } else {
        println("D")
    }
}

fun conditionalStatementIfExpression(){
    // Damn awesome!!!
    println("Chapter01 - Conditional Statement - if expression")
    val value: Int = if(10>5){
        println("10 is bigger than 5.")
        10
    } else {
        println("10 is lower than 5.")
        5
    }
    println(value)

    val another: Unit = if(10>5){
        val anotherA: Int = 10
    } else {
        val anotherB: Int = 5
    }

    // Actually meaning less...
    println(another)
}

fun conditionalStatementWhen(){
    println("Chapter01 - Conditional Statement - When")
    // val score = readLine()!!.toInt()
    val score = 64

    when (score / 10){
        6 -> { println("D") }
        7 -> { println("C") }
        8 -> { println("B") }
        9, 10 -> { println("A") }
        else -> { println("F") }

    }
    println("test")
}

fun conditionalStatementWhenExpression() {
    println("Chapter01 - Conditional Statement - When Expression")
    val score: Int = 95

    val grade: Char = when(score / 10){
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }
    println("Score : $score, Grade : $grade")

    val anotherGrade: Char = when{
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else -> 'F'
    }
    println("Score : $score, Another-Grade : $anotherGrade")
}

fun loopWhile() {
    println("Chapter01 - Loop - While")
    var i: Int = 1

    while (i < 10){
        println(i)
        i += 1
    }
}

fun loopDoWhile(){
    println("Chapter01 - Loop - Do While")
    var i = 1
    do {
        println("Run!!! - $i")
        i -= 1
    } while (i == 0)
}

fun loopContinue(){
    println("Chapter01 - Loop - Continue")
    var i: Int = 0

    while (i < 10){
        i += 1
        if (i % 2 == 0)
            continue
        println(i)
    }
}

fun loopBreak(){
    println("Chapter01 - Loop - Break")
    var i = 0
    while ( true ){
        i += 1
        if (i >= 5)
            break
        print("$i ")
    }
    println()
}

fun loopLabel(){
    println("Chapter01 - Loop - Label")
    var x = 0
    var y = 0

    while (x <= 20){
        y = 0
        while (y <= 20) {
            if (x + y == 15 && x - y == 5){
                break
            }
            y += 1
        }
        x += 1
    }
    println("x: $x, y: $y")

    // -----

    var xx = 0
    var yy = 0

    outer@ while ( xx <= 20){
        y = 0
        while (yy <= 20){
            if (xx + yy == 15 && xx - yy == 5)
                break@outer
            yy += 1
        }
        xx += 1
    }
    println("xx: $xx, yy: $yy")
}