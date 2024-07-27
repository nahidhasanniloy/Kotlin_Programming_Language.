package Kotlin_Programming.Class_4


fun main (){
    fun main() {
        // Creating arrays
        val numbers = arrayOf(1, 2, 3, 4, 5)
        val names = arrayOf("Alice", "Bob", "Charlie")

        // Accessing elements
        println("First number: ${numbers[0]}")
        println("First name: ${names[0]}")

        // Modifying elements
        numbers[0] = 10
        names[1] = "Robert"

        // Iterating over an array
        for (number in numbers) {
            println(number)
        }

        for (name in names) {
            println(name)
        }

        // Array of specific types
        val intArray = intArrayOf(1, 2, 3, 4, 5)
        val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)
        val booleanArray = booleanArrayOf(true, false, true)

        // Using lambda to initialize array
        val squares = Array(5) { i -> i * i }

        // Print squares
        for (square in squares) {
            println(square)
        }
    }


}



fun input() {

//    val  a = intArrayOf(1,3,4,5,6,7,8,9,0)
//    val b = doubleArrayOf(1.2,3.4,32.33,33.1)
//    val c = booleanArrayOf(true,false,true)
//    a[2]=10
//    b[0]=20.4
//    println("Int Array: ${a[2]}")
//    println("double Array: ${b[3]}")


}
