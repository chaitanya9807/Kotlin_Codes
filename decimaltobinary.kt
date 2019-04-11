import java.util.Scanner

fun main(args: Array<String>) {
    println("Enter a number:")
    val sc=Scanner(System.`in`)
    val a:Long= sc.nextInt().toLong()
    var n:Long=0L
    var sum:Long=0L
    var sum1:Long=0L
    var t=a
    while(t!=0L){
        n=t%2
        print(n)
        sum=sum*10+n
        t=t/2
    }
    println()
    while(sum!=0L){
        n=sum%10
        print(n)
        sum1=sum1*10+n
        sum/=10
    }
    println()
    println(sum1)
}