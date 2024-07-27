package Kotlin_Programming.Class_4

fun  main(){

    val name : String? = "Adnan nahid"
    println(name?.length) // Out put - 11

    // Nullable type
    var nullableString: String? = "Hello"
    nullableString = null
    println(nullableString?:"Invalid This")

    // Safe call

    var age :Int? = null
    println( age?:"Invalid Age ")

    //another
    val length: Int? = nullableString?.length
    println("Length: $length")  // Prints null


    // Elvis operator
    val lengthOrZero: Int = nullableString?.length ?: 0
    println("Length or Zero: $lengthOrZero")  // Prints 0


}