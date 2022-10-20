// Defining propertied withing constructor so on creation you have to specify
//class Employee(
//    val name: String,
//    var position: String
//        ) {
//    var label = "$name ($position)"
//}

//Example for school
//class Grade(
//    val points: Int,
//    val studentId: Int,
//    val topicId: Int
//)
//
//class Student(
//    val id: Int,
//    val name: String,
//    val surname: String
//)
//
//class Teacher(
//    val name: String,
//    val surname: String,
//    val birthday: String,
//    val status: String
//)
//
//class Subject(
//    val name: String,
//    val teacher: Teacher,
//    val isObligatory: Boolean,
//)

//class Barista(
//    val name: String
//) {
//    fun makeCoffee(type: String, size: Int): Coffee {
//        println("$name makes Coffee of type $type size $size")
//        return Coffee(type, size)
//    }
//
//    fun cheerAndMakeCoffee(type: String, size: Int) {
//        println("Hello")
//        makeCoffee(type, size)
//    }
//}
//
//class Coffee(
//    val type: String,
//    val size: Int
//)

// Example W/ Dog Class

//class Dog(val name: String) {
//
//    var hunger = 62
//
//    fun feed() {
//        val currentDog: Dog = this
//
//        println("Feeding ${currentDog.name}")
//
//        currentDog.hunger = 0
//    }
//}

// Example with User
//class User(var name: String) {
//
//    fun changeName(name: String) {
//
//        println("Changed name from ${this.name} to $name")
//
//        this.name = name
//    }
//}

fun main() {
//    Instance of a class - an Object with properties defined in the constructor
//    val employee1 = Employee("Benjamin", "Senior Admin")
//    val employee2 = Employee("Kwame", "Senior Engineer")
//
//    println("My name is ${employee1.name} and I am a ${employee1.position}")
//    println("My name is ${employee2.name} and I am a ${employee2.position}")
//
//    println(employee2.label)
//    println(employee1.label)

//    Example for school
//    val benjaminAyesu =
//        Teacher("Benjamin", "Ayesu", "04.28.1993", "ACTIVE")
//    val biology1 =
//        Subject("Biology 1", benjaminAyesu,true)
//    println(biology1.isObligatory)
//    println(biology1.teacher.birthday)
//    println(biology1.teacher.status)

//    val barista = Barista("Benjamin")
//    val coffee = barista.cheerAndMakeCoffee("Latte",1)

//    val dog = Dog("Rex")
//    dog.feed() // Feeding Rex

//val user = User("Alpha") // Changed name from Alpha to Beta
//
//    user.changeName("Beta") // Beta
//
//    println(user.name)

}