import java.lang.Math.pow
import java.util.Scanner

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    println("Enter a number")
    var n=sc.nextInt()
    var sum=0
    var t=n
    var i=0
    while(n!=0){
        t=n%10
        sum=sum*10+t
        n/=10
    }
    println("Reversed number is:$sum")
}