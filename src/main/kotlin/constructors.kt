class Dog(var breed: String ,var color:String){

}
fun main () {
    var c = Dog("Chiwawa", "White")
    println(c.breed)

    var d = Dog("Siberian husky", "Brown")
    println(d.color)
}