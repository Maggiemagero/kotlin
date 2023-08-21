open class Employee1{
    fun name(){
        println("Maggie")
    }
    fun age(){
        println("18")
    }
    fun salary(){
        println(450000)
    }
}
//child classes
class WebDeveloper:Employee1(){
    fun website(){
        println("E-commerce")
    }
}
class AndroidDeveloper:Employee1(){
    fun android(){
        println("My first app")
    }
}
class iOSDeveloper:Employee1(){
    fun iOS(){
        println("ios app")
    }
}
fun main(){
    var w =WebDeveloper()
    w.salary()
    var a =  AndroidDeveloper()
    a.salary()
    var i = iOSDeveloper()
    i.name()

}