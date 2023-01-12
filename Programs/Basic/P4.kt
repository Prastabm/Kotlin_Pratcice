//function to check appropriate age
import java.util.Scanner
fun main(args : Array<String>)
{
    println("Enter age: ")
    var sc = Scanner(System.`in`)
    var age=sc.nextInt()
    var r= if(age>18)
    {
        "age is appropriate"
    }
    else
    {
        "age is inappropriate"
    }
    print(r)
}
