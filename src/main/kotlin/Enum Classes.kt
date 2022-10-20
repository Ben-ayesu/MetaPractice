// Expressing a day of the week is good with enum
enum class Weekday {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

// In a game, you could specify a difficulty level
enum class Difficulty {
    EASY,
    MEDIUM,
    HIGH
}

// Could use to specify pizza sizes
enum class PizzaSize (
    val sizeInCm: Int
        ) {
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30)
}

fun printSize(pizzaSize: PizzaSize) {
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
}

fun main() {
    printSize(PizzaSize.MEDIUM) // MEDIUM is 20 cm
    printSize(PizzaSize.EXTRALARGE) // EXTRALARGE is 30 cm
}