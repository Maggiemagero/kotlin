import kotlin.math.ceil

fun main(){
    //Standard library functions //Predefined functions
    println("Hello Kotlin")

    var squareroot=Math.sqrt(81.0)
    println(squareroot)

    var number=Math.round(34.26)
    println(number)

    var num= ceil(45.2)
    println(num)

    sum()
    product(46,20)
    divide(50,2)
    details("Maggie",18)

}
//User-defined function

fun sum(){
    var num1=3
    var num2=4
    println(num1+num2)

}
//parameterized functions
fun product(x:Int,y:Int){

    println(x*y)
}
fun divide(first:Int, second:Int){
    println(first/second)

}
fun details (name:String,age:Int){
    println("My name is $name. I am $age years old")

}