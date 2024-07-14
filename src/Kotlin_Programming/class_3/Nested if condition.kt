package Kotlin_Programming.class_3

fun main() {
    println(" Enter Your score :")
    val score = readln().toInt()
    println(" Tell me do you need Money..? true or false ! :")
    val money = readln().toBoolean()


    if (score in 90..100) {
        println("Grade: A")
    }

    else {
        if (score >= 80) {
            println("Grade: B")
        }
        else {
            if (score >= 70) {
                println("Grade: C")
            } else {
                if (score >= 60) {
                    if (money==true){
                        println("yes I need Money cause I have to get married..")
                    }
                    else{
                        println( "I want to be single forever that's why no need this  ")
                    }

                }
                else {
                    println("Grade: F")
                }
            }
        }
    }

}






