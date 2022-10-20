fun main() {
    // Creating Maps
    val capitals = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    //    val capitals = mapOf(
    //        Pair("USA", "Washington"),
    //        Pair("Poland", "Warsaw"),
    //        Pair("Ukraine", "Kyiv")
    //    )
    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}

    // Finding a value for a key
    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null

    // Adding elements to a map
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Bob, C=Celina}
    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3
    println(map3) // {D=Daniel, E=Ellen}
    println(map4) // {A=Alex, B=Bob, C=Celina, D=Daniel, E=Ellen}

    // Checking if a map contains a key
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    println('A' in map) // true
    println('Z' in map) // false

    // Checking Map Size
    println(map.size)

    // Iterating over map
    for ((x,y) in map) {
        println("$x is for $y")
    }
}
