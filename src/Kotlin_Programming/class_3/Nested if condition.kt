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
    nex()
}


//Find The Maximum Number From The Three Number


fun nex(){
    println("Nested if else ...")
    println(" Find The Maximum Number From The Three Number  ")

    println(" Enter Your First No :" )
    var number1:Int = Integer.valueOf(readln())
    println("Enter Your second No :")
    var number2:Int=Integer.valueOf(readln())
    println("Enter Your third No :")
    var number3:Int=Integer.valueOf(readln())

    val result = if (number1>number2){

       val maximum = if (number1>number3){
           number1


        }
        else{
            number3
        }
        " Your maximum No :$maximum "
    }
    else if (number2>number3){
        " Maximum Number is $number2"
    } else {
        "The maximum Number is : $number3"
    }

    println(result)


}








