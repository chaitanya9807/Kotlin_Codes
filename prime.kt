import java.util.Scanner

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    println("Enter a number")
    var n=sc.nextInt()
    var flag=0
    for(i in 2..n/2) {
        if (n % 2 == 0)
            flag = 1
            break
    }
    if(flag==1)
        println("NOT PRIME")
    else
        println("PRIME")

}