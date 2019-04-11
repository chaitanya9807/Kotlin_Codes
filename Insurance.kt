import java.util.Scanner

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    println("Enter your age:")
    var age:Int=sc.nextInt()
    println("Enter your name:")
    var name:String=sc.next()
    println("Enter your gender:")
    var gender: String=sc.next()
    println("Enter your city:")
    var city:String=sc.next()
    when{
        age<=35&&age>=25&&gender=="Male"&&city=="Metro"-> println("$name Your Premium is 6%")
        age<=40&&age>=25&&gender=="Male"&&city=="Non Metro"-> println("$name Your Premium is 4%")
        age<=42&&age>=25&&gender=="Female"&&city=="Metro"-> println("$name Your Premium is 3%")
        age<=45&&age>=25&&gender=="Female"&&city=="Non Metro"-> println("$name Your Premium is 2%")
        else-> println("Sorry $name You're not insured.")
    }


}