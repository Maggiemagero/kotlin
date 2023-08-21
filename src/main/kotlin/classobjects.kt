class person (){
    //attribute/Property/Variable
    var name ="Maggie"
    var skintone = "lightskin"
    var age = 18

    //Method/Funtion
    fun eat(){
        println("Eating")
    }
    fun walk (){
        println("Walking")
    }

}

fun main (){
    //object1
    var teacher = person()
    println(teacher.age)
    teacher.walk()

    //object2
    var accountant  = person()
    println(accountant.name)
    accountant.eat()

}