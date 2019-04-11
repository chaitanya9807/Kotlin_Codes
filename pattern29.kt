/*
    *****
     ****
      ***
       **
        *

 */
fun main(args: Array<String>) {
    for(i in 5 downTo 1){
        for(j in 5 downTo i)
            print(" ")
        for(k in 1..i)
            print("*")
        println()
    }
}