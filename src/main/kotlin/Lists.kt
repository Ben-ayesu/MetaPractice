fun main() {

    // Adding elements to a list
    val list = listOf("A","B")
    println(list + "C")
    println(list + listOf("C", "D"))
    println()

    // Getting the size of a list
    println(list)
    println(list.isEmpty())
    println("This size of the list is ${list.size}")
    println()

    // Getting elements at certain positions
    println(list[0])
    println(list[1])
    println()

    // Checking if list contains an element
    println(list.contains("A"))
    println(list.contains("Z"))
    println("A" in list)
    println("Z" in list)
    println()

    // Iterating over list
    val letters = listOf("A", "B","C")
    for (i in letters)  {
        println(i)
    }
    println()

    // Using mutable list
    val lists = mutableListOf("A","B")
    lists.add("C")
    println(lists)
    lists.remove("B")
    println(lists)

    lists[0] = "Z"
    println(lists)
}