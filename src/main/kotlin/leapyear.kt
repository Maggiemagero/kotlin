import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)


    println("Enter year: ")
    var year = reader.nextInt()

    if (year%4==0){
        println("This is a leap year")
    }
    else{
        println("This is not a leap year")
    }

}