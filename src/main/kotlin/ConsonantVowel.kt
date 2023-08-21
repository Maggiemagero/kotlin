import java.util.Scanner
fun main (){
    var reader = Scanner(System.`in`)

    println("Enter an alphabet: ")
    var alphabet = reader.next().single()

    if(alphabet=='a'||alphabet=='e' ||alphabet=='i'||alphabet=='o'||alphabet=='u')
        println("It is a vowel")
    else{
        println("It is a consonant")
    }


}