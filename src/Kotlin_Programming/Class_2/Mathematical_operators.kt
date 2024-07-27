package Kotlin_Programming.Class_2

fun main() {
    val a = 10
    val b = 5

    // Addition
    val sum = a + b
    println("Sum: $sum")  // Output: 15

    // Subtraction
    val difference = a - b
    println("Difference: $difference")  // Output: 5

    // Multiplication
    val product = a * b
    println("Product: $product")  // Output: 50

    // Division
    val quotient = a / b
    println("Quotient: $quotient")  // Output: 2

    // Modulus
    val remainder = a % b
    println("Remainder: $remainder")  // Output: 0


    operator ()
    floating_point_numbers()
}

fun floating_point_numbers() {
    val x = 220.0
    val y = 8.0

    // Addition
    val sum = x + y
    println("Sum: $sum")

    // Subtraction
    val difference = x - y
    println("Difference: $difference")

    // Multiplication
    val product = x * y
    println("Product: $product")

    // Division
    val quotient = x / y
    println("Quotient: $quotient")
    // Modulus
    val remainder = x % y
    println("Remainder: $remainder")
}





fun operator (){
    val x = 32
    val y = 21
    var z = x+y
    println("The addition is : $z")

    val s = 32
    val t = 21
    val e = s-t
    println("The subtraction is : $e")

    val w = 32
    val q = 21
    val a = w*q
    println("The multiplication is : $a")

    val xy = 32
    val er = 21
    val xz = xy+er
    println("The division is : $xz")
    println()

    val yy = 32
    val uu = 12
    val jj = yy%uu
    println("the modules is : $jj")


}
