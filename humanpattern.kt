/*
           *
         *   *
       *       *
         *   *
           *
     *************
     *           *
     *           *
     *           *
     *           *
     *           *
     *           *
     *************
     *************
     *************
     ****** ******
     *****   *****
     ****     ****
     ***       ***
     **         **
     *           *

 */
fun main(args: Array<String>) {
    //HEAD
    for (i in 1..3) {
        for (j in 7 downTo 2 * i)
            print(" ")
        print("*")
        if (i == 2) {
            for (k in 1..(2 * i) - 1)
                print(" ")
            print("*")
        } else if (i == 3) {
            for (k in 1..(3 * i) - 2)
                print(" ")
            print("*")
        }
        println()
    }
    for (i in 2 downTo 1) {
        for (j in 7 downTo 2 * i)
            print(" ")
        print("*")
        if (i == 2) {
            for (k in 1..(2 * i) - 1)
                print(" ")
            print("*")
        }
        println()
    }
    //MIDDLE
    for(i in 1 until 14)
        print("*")
    println()
    for(i in 1..6 ){
        print("*")
        for(j in 1..11)
            print(" ")
        print("*")
        println()
    }
    for(i in 1 until 14)
        print("*")
    println()
    //LEGS
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
    }}