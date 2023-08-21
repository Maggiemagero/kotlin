class Employee ( var jobdescription:String,var salary:Double,
                 var yearsexperience:Int, var age:Int  ){

}
fun main (){
    var a = Employee("Manager",250000.00,5,50)
    println(a.jobdescription)

    var b = Employee("Secretary",45000.00,3,25)
    println(b.jobdescription)
    
}