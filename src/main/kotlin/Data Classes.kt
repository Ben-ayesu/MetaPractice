data class Doggie(
    val name: String,
    val age: Int
)

fun main() {
    val pluto1 = Doggie("Pluto",5)
    val pluto2 = Doggie("Pluto",5)
    val rex = Doggie("Rex",3)

    val (name, age) = pluto1
    println("I am $name and I am $age years old")
    println()

    println(pluto1 == pluto2)
    println(pluto1 == pluto1)
    println(pluto1 == rex)
    println()

    println(pluto1)
    println("Dog: $pluto1")
    println()

    // Data classes have a copy method that creates a copy of an object
    println(pluto1.copy())
    println(pluto1.copy(age = 8))
    println(pluto1.copy(name = "Benjamin"))
}