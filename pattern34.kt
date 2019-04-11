/*
        *
       ***
      *****
     *******
    *********

 */
fun main(args: Array<String>) {
    for(i in 1..5){
        for(j in 5 downTo i)
            print(" ")
        for( k in 1..(2*i)-1)
            print("*")
        println()
    }
}