fun warmUp(){
    /* Variable and Value */
    val name: String = "Jeongsik Hwang"
    var nick: String = "kkamikoon"
    // name = "Jungsik Hwang" // Val cannot be reasigned

    println("Hello, $name ($nick)!")
    typeTester()
}

fun typeTester() {
    // With define types.
    var byteVariable: Byte = 0x41
    var intVariable: Int = 100
    var intVariableByHex: Int = 0x1234
    var intVariableByBin: Int = 0b01101111
    var longVariable: Long = 1000000000
    var stringVariable: String = "The type test"
    var doubleVariable: Double = 123.456
    var doubleVariableWithExp: Double = 123.456e06
    var floatVariable: Float = 123.456f

    println("[=] ==========================================")
    println("[=] Variables with define type.")
    println("""
        [+] Byte : $byteVariable ${byteVariable::class.simpleName}
        [+] Integer : $intVariable ${intVariable::class.simpleName}
        [+] Integer with hex : $intVariableByHex ${intVariableByHex::class.simpleName}
        [+] Integer with bin   : $intVariableByBin ${intVariableByBin::class.simpleName}
        [+] Long : $longVariable ${longVariable::class.simpleName}
        [+] String : $stringVariable ${stringVariable::class.simpleName}
        [+] double : $doubleVariable ${doubleVariable::class.simpleName}
        [+] double with exp : $doubleVariableWithExp ${doubleVariableWithExp::class.simpleName}
        [+] float : $floatVariable ${floatVariable::class.simpleName}
        """.trimIndent()
    )
    // Without define types
    var byteVar = 0x41
    var intVar = 100
    var intVarByHex = 0x1234
    var intVarByBin = 0b01101111
    var longVar = 10000000
    var stringVar = "The type test"
    var doubleVar = 123.456
    var doubleVarWithExp = 123.456e06
    var floatVar = 123.456f

    println("[=] ==========================================")
    println("[=] Variables without define type.")
    println("""
        [+] Byte : $byteVar ${byteVar::class.simpleName}
        [+] Integer : $intVar ${intVar::class.simpleName}
        [+] Integer by hex : $intVarByHex ${intVarByHex::class.simpleName}
        [+] Integer by bin : $intVarByBin ${intVarByBin::class.simpleName}
        [+] Long : $longVar ${longVar::class.simpleName}
        [+] String : $stringVar ${stringVar::class.simpleName}
        [+] double : $doubleVar ${doubleVar::class.simpleName}
        [+] double with exp : $doubleVarWithExp ${doubleVarWithExp::class.simpleName}
        [+] float : $floatVar ${floatVar::class.simpleName}
        """.trimIndent()
    )
}