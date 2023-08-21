//Parent class
open class Shape{
     fun area (){
         println(150)
     }
     fun circumference(){
         println(60)
     }
 }
//Child classes
class Rectangle:Shape(){
    var length=15
    var bredth=10

    fun getlength(){
        println(length)
    }
    fun getbredth(){
        println(bredth)
    }
}
class Circle:Shape(){
    var radius =14

    fun getradius(){
        println(radius)
    }

}
fun main (){
    var r = Rectangle()
    r.area()
    var c = Circle()
    c.circumference()

}