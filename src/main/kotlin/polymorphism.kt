//Parent class
open class Shape1{
    open fun draw(){
        println("It is a shape")
    }

}
//Child class
class Rectangle1:Shape1(){
    override fun draw() {
        println("Rectangle")
    }

}
class Square:Shape1(){
    override fun draw(){
        println("Square")
    }
}
fun main(){
    var r = Rectangle1()
    r.draw()

    var s = Square()
    s.draw()
}