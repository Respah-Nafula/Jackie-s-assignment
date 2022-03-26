
//i: Print an Array using For loop
//Val array = intArrayOf(1, 2, 3, 4, 5)
fun main(){
    var phone=mobile("Samsung","A32","CPS")
    println(phone.brand)
    println(phone.MRP)
    println(phone.model)
    var babygirl=girl("Respah","Wakhungu",23)
    println(babygirl.lastName)
    println(babygirl.age)
    var man=Employee("Simon","simonmasika@gmail.com","Ushindi")
    println(man.name)
    print(man.email)
    println(man.company)
    var addition=arrays(arrayOf(100,200))
    println(addition)



}
 class mobile(var model: String,var brand:String,var MRP:String)
fun simu(details:Int){
   }
class girl(var firstName:String,var lastName:String,var age:Int)
fun lady(credentials:String){

}
class Employee(var name:String,var email:String,var company:String)
fun worker(details:String){
}
//Integer
// Double
//String

fun arrays(numbers:Array<Int>): Int{
    var sum=1
    numbers.forEach { number->
        sum+=number
    }
    return sum
}
fun digits(numbers: Array<String>){
   var array =intArrayOf(1,2,3,4,5)
    for (nums in array) {
        println(nums)
    }
     }
