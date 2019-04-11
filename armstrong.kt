import java.lang.Math.pow
import java.util.Scanner

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    println("Enter a number")
    var n=sc.nextInt()
    var t=n
    var r=0
    var i=0
    var sum=0
    while(t!=0){
        t/=10
        i++
    }
    t=n
    while(n!=0)
    {
        r=n%10
        sum= sum+pow(r.toDouble(), i.toDouble()).toInt()
        n/=10
    }
    if(sum==t)
        println("Armstrong number")
    else
        println("Not an Armstrong number")

}