import java.util.Scanner
fun main(){
    var reader = Scanner(System.`in`)

    println("Enter student marks: ")
    var marks = reader.nextDouble()

    if (marks>=80 && marks<=100){
        println("Student has scored an A")
    }
    else if (marks>=70 && marks<80){
        println("Student has scored a B")
    }
    else if (marks>=60 && marks<70){
        println("Student has scored a C")
    }
    else {
        println("Student has failed")
    }
}