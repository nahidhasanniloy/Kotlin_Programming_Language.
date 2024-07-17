
fun main (){
//    println(" Enter Your Temp :")
//    val temp = readln().toInt()
//
//    when(temp){
////        10 -> println(" Ac OF ")
////        20 -> println(" Ac ON ")
////        30 ->println(" High temp  ")
////        else -> println(" Nothing ")
//
//    }
score()
    temp()
    age()

}

fun score() {
    println("Enter Your Score :")
     var yourscore = readln().toInt()
     when{
        yourscore<0-> println("   Nothing will happen to you")
        yourscore in 0..20 -> println(" Grade D+")
        yourscore in 20..40 -> println(" Grade C+")
        yourscore in 40..60 -> println(" Grade B+")
        yourscore in 60 ..80 -> println(" Grade A+")
        else -> println(" You are Fail ")
    }


}
fun temp(){
    println("Enter Your Tempareture : ")
    var temp = readln().toInt()
    when (temp){
          in 0..10 -> println(" ICE")
          in 10..20-> println(" very cold")
          in 20..30-> println(" Normal ")
         else -> println(" Very Hot ")
    }


}

fun age(){

    val age = 30
    val result  = when(age){
        10 -> " Child "
        20 -> " Young "
        30 -> " You are perfect for married "
        50 -> " You are older persone thats why you cant marry any girls "
        else ->" You are Not parfect for married "

    }
    println(result)

}






