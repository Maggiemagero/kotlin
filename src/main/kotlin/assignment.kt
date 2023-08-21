import java.util.Scanner
fun main(){
    var reader = Scanner(System.`in`)

    println("Enter first number: ")
    var num1=reader.nextDouble()

    println("Enter second number: ")
    var num2=reader.nextDouble()

    println("Enter operation (+,-,*,/): ")
    var operator= readln()

    var Answer = when(operator){
        "+" -> num1+num2
        "-" -> num1-num2
        "*" -> num1*num2
        "/" -> num1/num2

        else -> "invalid operation"

    }
    println("Answer = $Answer")

}