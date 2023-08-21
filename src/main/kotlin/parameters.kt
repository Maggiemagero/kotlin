class Animal(var colour:String,var size :Int){
    fun eat(){
        println("It is eating")
    }
    fun sleep(name:String){
        println("The animal is $name")
    }
    fun woof (){
        println("Woofing")
    }
}
fun main (){
    var a=Animal("White",34)
    var f = Animal("brown",56)
    f.sleep("fish")
    var l =Animal("white",67)
    l.sleep("leopard")

}