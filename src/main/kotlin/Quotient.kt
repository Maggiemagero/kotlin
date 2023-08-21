import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter first number: ")
    var num1=reader.nextInt()
    println("Enter second number: ")
    var num2= reader.nextInt()

    var quotient = num1/num2
    var modulus = num1%num2
    println("The quotient of the two numbers is $quotient.The remainder of the two numbers after division is $modulus")

}