import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Enter three numbers:")
    var n1 = sc.nextInt()
    var n2=sc.nextInt()
    var n3=sc.nextInt()
    if(n1>n2&&n1>n3)
            println("First is greatest")
    else if(n2>n3)
            println("Second is greatest")
    else
            println("Third is greatest")
}
