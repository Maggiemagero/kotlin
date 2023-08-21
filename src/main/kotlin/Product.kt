import java.util.Scanner
fun main(){
    var reader = Scanner(System.`in`)

    println("Enter first number: ")
    var num1 = reader.nextInt()

    println("Enter second number:")
    var num2 = reader.nextInt()

    var product=num1*num2
    println("The product of the two numbers is $product")
}