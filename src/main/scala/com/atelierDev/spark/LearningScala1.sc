// VALUES are immutuable constants
val hello: String = "Hola!"

// VARIABLES are mutable
var helloThere: String = hello
helloThere = hello + " There"

val immuatableHelloThere = hello + " There"

// Data types
val numberOne: Int = 1
val truth: Boolean = true
val lettreA: Char = 'a'
val pi: Double = 3.14159265
val piSignlePrecision: Float = 3.14159265f
val bigNumber: Long = 123456789
val smallNumber: Byte = 127

println("Here is a mess: " + numberOne + truth + lettreA + pi + bigNumber)
println(f"Pi is about $piSignlePrecision%.3f")

println(f"Zero padding on the left: $numberOne%05d")

println(f"I can use the s prefix to use variables like $numberOne $truth $lettreA")

val theUltimateAnswer: String = "To life, the universe, and everything is 42"
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer

// Booleans
val isGreater = 1 > 2
val isLesser = 1 < 2
val impossible = isGreater & isLesser
val anotherWay = isGreater || isLesser

// Exercice
//Ecrivez un code qui prend la valeur pi, type double, puis l'affiche dans une
//chaîne de caractères avec trois décimales de précision

val pi: Double = 3.14159265
println(f"Pi : $pi%.3f")


// ing.mahamoud.ali@gmail.com








