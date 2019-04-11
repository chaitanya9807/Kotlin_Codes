import java.util.Scanner
fun main(args: Array<String>) {


    var sc = Scanner(System.`in`)
    println("Enter basic salary:")
    var basic=sc.nextInt()
    var hra=sc.nextInt()
    var da=0.2*basic
    var ta=0.1*basic
    var net=basic+da+hra+ta-1400
    println("HRA=$hra,da=$da,ta=$ta")
    println("Net salary is: $net")
}