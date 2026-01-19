import kotlin.math.pow

fun main() {
    arithmetic(5,2)
    variable()
}

fun arithmetic(a: Int, b: Int) {
    val addition = a + b
	val subtraction = a - b
	val multiplication = a * b
	val division = a / b
    val power = a.toDouble().pow(b)  // for Int not available .pow(), so first needs to convert to Double
	val remainder = a % b
	println("""
        addition: $addition
        subtraction: $subtraction
        multiplication: $multiplication
        division: $division
        power: $power
        remainder: $remainder
    """.trimIndent())
}

fun variable(){ 
    val a: Int = 5
    println(a.toDouble().pow(2))
	  println("- Did Joffrey agree?\n- He did. He also said \"I love using \\n\".")  //Line Feed \n   
    println("\"Khal Drogo's favorite word is \"athjahakar\"\"") // escape character \
    println(70 * (3 + 4) / (8 + 2))
    println(0.2 + 0.1)
    println(Int.MAX_VALUE)
}
