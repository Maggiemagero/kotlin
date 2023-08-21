//Parent class/super class/Base class
open class Animal1{
    var color="Brown"
    fun eat(){
        println("Animal is eating")
    }

}
//Child class/Sub class/Derived class
open class Dog1:Animal1(){
    var name = "Siberian husky"
    fun sound (){
        println("Dog is barking")
    }
}
class cat:Dog1(){
    var hasFur =true
    fun meow(){
        println("Meowing")
    }
}
fun main (){
    var a = Animal1()
    println(a.color)
    a.eat()

    var d = Dog1()
    d.eat()


    var c = cat()
    c.meow()
    println(c.hasFur)

}