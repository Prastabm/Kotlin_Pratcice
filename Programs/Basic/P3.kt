//Understanding Inputs and outputs

import java.util.Scanner    //importing java.util.Scanner class to use the Scanner object
fun main(Args: Array<String>)
{
    //Input using Kotlin standard input
    println("Enter your name: ")
    var name= readLine()
    println("Enter your age: ")
    var age= readLine()
    println("Your name is $name and your age is $age")

    //Input using Scanner class
    var sc= Scanner(System.`in`)
    println("Enter your name: ")
    var name2=sc.nextLine()
    println("Enter your age: ")
    var age2=sc.nextInt()
    println("Your name is $name2 and your age is $age2")


}
