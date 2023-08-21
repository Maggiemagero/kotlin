fun main(){
   var language= arrayOf("Kotlin","java","PHP")

    //Accessing an element
    println(language[0])

    //reassigning a value
    language[1]="Python"
    for (x in language){
        println(x)
    }

    //size of array
    println(language.size)

    //Adding a new element to an array
    var new=language.plus("C++")
    for (b in new){
        print(b)
    }




}