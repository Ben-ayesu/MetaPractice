// Exercise practice handling nullability
//Step 1 - Student class and list of students
data class Student (
    val Id: Int,
    val fullName: String,
    val grade: Double
        )

val Students = listOf(
    Student(223, "John", 140.0),
    Student(548, "Mark", 120.0),
    Student(342, "Natali",150.0),
    Student(781,"Sara",130.0)
)

fun getStudentById(id: Int): Student {
    return Students.find { it.Id == id }!!
}

fun searchInStudents(name: String): Student? {
    return Students.find { it.fullName.lowercase() == name.lowercase() }
}


fun main() {
//    var message: String? = "Hello World"
//    message = null // Assign null to the variable
//
//    if (message != null) {
//        var length = message.length // Will not cause error because you have checked the value is not null
//        println(length)
//    } else {
//        println(null)
//    }
//
//    //Safe call example
//    var messages: String? = "Hello World"
//    print(messages?.length) //Will print 11
//    messages = null //Assign null to the variable
//    print(messages?.length) //Will print null

    // Step 2 in Exercise
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println(getStudentById(id))
    println("Please, Enter the student's name")
    val name = readln()
    println(searchInStudents(name)?: "The student is not found")

}