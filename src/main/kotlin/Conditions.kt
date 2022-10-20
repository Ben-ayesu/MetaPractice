fun main() {
//     Practice using conditions - Task 1
    val weekday = "Saturday"
    println("On $weekday, the opening hours are: ")
    when (weekday) {
        "Monday" -> println("8 AM to 12 PM")
        "Tuesday" -> println("8 AM to 6 PM")
        "Wednesday" -> println("8 AM to 6 PM")
        "Thursday" -> println("8 AM to 6 PM")
        "Friday" -> println("8 AM to 9 PM")
        "Saturday" -> println("9 AM to 4 PM")
        "Sunday" -> println("8 AM to 4 PM")
    }
    println()
    // Practice using conditions - Task 2
    val weekdays = "Friday"
    val hour = 14
    val isOpen = when (weekday) {
        "Monday" -> hour in 8..12
        "Tuesday" -> hour in 8..18
        "Wednesday" -> hour in 8..18
        "Thursday" -> hour in 8..18
        "Friday" -> hour in 8..18
        "Saturday" -> hour in 9..16
        else -> hour in 8..16
    }
    when (isOpen) {
        true -> println("Little Lemon is open now")
        else -> println("Little Lemon is closed now")
    }
}