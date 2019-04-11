import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    println("Enter a number:")
    var n:Double=sc.nextInt().toDouble()
    println("Square root of the number entered is ${sqrt(n)}")
}