import java.util.Scanner

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    println("Enter your percentage")
    var per=sc.nextInt()
    when{
        per>=90->println("Grade A")
        per<90&&per>=70->println("Grade B")
        per<70&&per>=50->println("Grade C")
        per<50->println("Grade D")
        else-> println("Enter another percentage value")
    }

}