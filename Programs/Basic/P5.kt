//program to perform addition subtraction multiplication and division using 'when'
import java.util.Scanner

fun main(args: Array<String>)
{
    var sc=Scanner(System.`in`)
    println("\n1.Enter 1 to add \n2. Enter 2 to subtract \n3.Enter 3 to multiply \n4.Enter 4 to divide:")
    println("enter your choice")
    var choice=sc.nextInt()
    var r= when(choice)
    {
        1->{
           println("Enter 2 numbers")
           var num1=sc.nextInt()
           var num2=sc.nextInt()
           println("The sum is: "+(num1+num2))
        }
        2->{
            println("enter two numbers: ")
            var num1=sc.nextInt()
            var num2=sc.nextInt()
            println("the difference is: "+(num1 - num2))
        }
        3->{
            println("enter two numbers: ")
            var num1=sc.nextInt()
            var num2=sc.nextInt()
            println("the product is: "+(num1 * num2))
        }
        4->{
            println("enter two numbers: ")
            var num1=sc.nextInt()
            var num2=sc.nextInt()
            println("the quotient is: "+(num1 / num2))
        }
        else->{
            print("Wrong choice")
        }
    }
}
