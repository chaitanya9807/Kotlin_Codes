/*
    1
    22
    33
    44
    33
    22
    1

*/
fun main(args: Array<String>) {
    for(i in 1..4)
    { for(j in 1..2)
        {   if(i<j){
            break
        }
            print(i)

        }
    println()
    }

    for(i in 3 downTo 1){
        for(j in 1..2){
            if(i<j)
                break
            print(i)
        }
    println()
    }
}