/*
       3
      23
     123
    0123
     123
      23
       3

 */
fun main(args: Array<String>) {
    for(i in 1..4){
        for(j in 3 downTo i)
            print(" ")
        for(k in 4-i..3)
            print(k)
        println()
    }
    for(i in 1..3) {
        for (j in 1..i)
            print(" ")
        for(k in i..3)
            print(k)
        println()
    }
}