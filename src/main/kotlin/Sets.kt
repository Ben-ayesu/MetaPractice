fun main() {

    // Creating a set
    val set = setOf('A','B','C')
    println(set)
    println()

    // Adding elements to a set
    println(set + 'D') // [A, B, C, D]
    println(set + setOf('D', 'E')) // [A, B, C, D, E]
    println(setOf('Z') + set) // [Z, A, B]
    println()

    // Getting size of the set
    println(set.size)
    println()

    // Elements are unique
    val sets = setOf('A', 'B', 'C', 'A')
    println(sets + 'B') // [A, B, C]
    println(sets + setOf('B', 'D')) // [A, B, C, D]
    println()

    // Example with Classes/ Data Classes
    class User(val name: String)
    data class Users(val name: String)

    val setOfUsers = setOf(User("A"), User("A"))
    println(setOfUsers + User("A"))
    println()

    val setsOfUsers = setOf(Users("A"), Users("A"))
    println(setOfUsers + Users("A"))
    println(setsOfUsers)
    println()

    // Checking if a set contains an element
    println(set.contains('A'))
    println(set.contains('Z'))
    println('A' in set)
    println('Z' in set)
    println('A' !in set)
    println()

    // Iterating over set
    for (i in set) {
        print(i)
    }

    // Using mutable set
    val settter = mutableSetOf('A', 'B')
    settter.add('C')
    println(settter) // [A, B, C]
    settter.remove('B')
    println(settter) // [A, C]
}