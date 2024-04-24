// Value are immutable = const
val hello: String = "hello"

// Var are mutable
var hello2: String = hello
hello2 = "test " + hello

val immutable = hello + "There :"

val numberOne: Int = 1
val numberTwo: Integer = 2;
val truth: Boolean = true

// Display
println(f"test bbq $truth")


// Write code who take PI value type double and then displayed it
// in a string with 3

val pI: Double = java.lang.Math.PI

println(f"Pi value with 3 decimal $pI%.3f")
