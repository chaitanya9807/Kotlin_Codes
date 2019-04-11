/*
    1
    23
    345
    5678
    89101112

 */
fun main(args: Array<String>) {
    var count=1
    for(i in 0 until 2){
        for(j in 0 until i+1)
        {
            print(count)
            count++
        }
        println()
    }
    for(i in 2 until 5){
        for(j in 0 until i+1)
        {
            print(count-1)
            count++
        }
        count--
    println()
    }
}