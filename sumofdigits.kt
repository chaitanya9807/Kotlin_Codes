import java.util.Scanner

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    var sum=0
    println("Enter a number")
    var n=sc.nextInt()
    var t=0
    while(n!=0)
    {
        t=n%10
        sum+=t
        n/=10
    }
    println("Sum of digits is:$sum")
}