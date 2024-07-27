package Kotlin_Programming.class_3

fun  main(){
        var adnan = 2
            for ( i in 0..78 step 3)
               println(i)
    next()
    next1()
}

fun  next(){

    for ( i in 10 downTo -100 step 2)
        println(i)

}
fun next1 (){
        val num = 7
        for (i in 1..10)
            println("$num x $i = ${num*i}")

    next3()

}



fun  next3(){
     println(" Enter Your Number :")
      val no = readln().toInt()
        for(i in 1..10)
           println("$no x $i = ${no*i}")


}
