/*
    3
    32
    321
    3210
    321
    32
    3

 */
fun main(args: Array<String>) {
    for(i in 1..4){
        for(j in 3 downTo 4-i)
            print(j)
        println()
    }
    for(i in 1..3){
        for(j in 3 downTo i)
            print(j)
        println()
    }
}