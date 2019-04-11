import java.util.Scanner

fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    var t = sc.nextInt()
    var a = t
    var n = 0
    while(a!=0){
    if (a % 100 == 0)
        while (a != 0) {
            n = n + 24
            a / 100
            break
        }
    else if (a % 25 == 0)
        while (a != 0) {
            n += 12
            a /= 25
            break
        }
    else if (a % 10 == 0)
        while (a != 0) {
            n += 2
            break
        }
    else if (a % 1 == 0)
            break
    }
    println("Number of zeroes in $t!=$n")
        }

