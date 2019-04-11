/*
     *
    ***
   *****
  *******
 *********

 */
fun main(args: Array<String>) {

    for(row in 1..5)
    {   for(spaces in 5 downTo row){
        print(" ")
    }
        for(column in 1..(2*row)-1) {
            print("*")
        }
        println()
    }
}
