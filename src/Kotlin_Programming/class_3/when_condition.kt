package Kotlin_Programming.class_3

fun main() {
    val score = 90


    val grade = when {
        score  in 90..100 -> "A"
        score  in 80..89 -> "B"
        score  in 70..79 -> "C"
        score  in 60..69 -> "D"
        else -> "F"
    }

    println("Grade: $grade")
}
