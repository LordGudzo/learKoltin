import kotlin.math.pow
const val MAX_USERS = 100  //const


fun main() {
	variable()
    arithmetic(5,2)    
}

fun variable(){ 
	val name: String = "Andrey " // unmutable
	var age: Int = 34 // mutable
}

fun arithmetic(a: Int, b: Int) {
    val addition = a + b
	val subtraction = a - b
	val multiplication = a * b
	val division = a / b
    val power = a.toDouble().pow(b)  // for Int not available .pow(), so first needs to convert to Double
	val remainder = a % b
	println("""                      // """ raw string, allows to write multi-line text without escaping
        addition: $addition			 // $ pastes the value of a variable directly to the String
        subtraction: $subtraction
        multiplication: $multiplication
        division: $division
        power: $power
        remainder: $remainder
    """.trimIndent())                 // .trimIndent() cleans spaces in the String
}


