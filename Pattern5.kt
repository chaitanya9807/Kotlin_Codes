/*
    *************
    ****** ******
    *****   *****
    ****     ****
    ***       ***
    **         **
    *           *

 */
fun main(args: Array<String>) {
    for(i in 1 until 14)
        print("*")
    println()
    for(i in 2..7){
            for (j in 7 downTo i)
                print("*")
            for(k in 1..(2*i)-3)
                print(" ")
            for(m in 7 downTo i)
                print("*")
            println()
    }
}