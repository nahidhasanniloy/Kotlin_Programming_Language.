package Kotlin_Programming.class_1

fun main(){
    myInfo()

}
fun myInfo() {
    val First_Name = "Adnan "
    val Last_Name = "Nahid "
    var full_name ="$First_Name $Last_Name "
    full_name = "An. $full_name "
    val roll = 14
    val height = 5.5
    val blood_Group: String = "A+"


    println(" My name is  : $full_name")
    println(" class Roll  : $roll")
    println(" Height      : $height")
    println(" bload Groupt: $blood_Group")
    otherPerson()
}
fun otherPerson() {
    val First_Name ="SAJID "
    val Last_Name ="AHMED "
    var full_name ="$First_Name $Last_Name "
    full_name = "$full_name"
    val roll = 65
    val height = 5.11
    val blood_Group: String = "B+"


    println(" My name is  : $full_name")
    println(" class Roll  : $roll")
    println(" Height      : $height")
    println(" bload Groupt: $blood_Group")


}