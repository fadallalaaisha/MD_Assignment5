fun main() {
    //calling question 1
var person=Human("Rouda",35,58)
    person.eat(65)
    println(person.name)

    person.speak("Hello Janet can you help me with your charger?")

    person.birthday()
    // calling question 2
var Asma=User("Rouda","Asma","rouda@gmail.com",77000,5566)
    println(Asma.firstname)
    println(Asma.lastName)
}
//question 1
class Human(var name:String,var age:Int,var weight:Int){
fun eat(foodWeight:Int){
    var eatFood=("I am eatting $foodWeight kgs of food.")
    println(eatFood)
  var newWeight=foodWeight+weight
    println(newWeight)
}
fun speak(speech:String){
    println("$speech")
}
fun birthday(){
      age+=1
    println(age)
}}
//question 2
data class User(var firstname:String,var lastName:String,var email:String,var phoneNumber:Int
,var password:Int)
