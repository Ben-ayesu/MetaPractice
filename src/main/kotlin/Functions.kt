/*
Function for printing a triangle
 */
//fun printStars(num: Int) {
//    for (j in 1..num) {
//        print("*")
//    }
//    println()
//}
//
//fun ascendingTriangle(height: Int) {
//    for (i in 1..height) {
//        printStars(i)
//    }
//}
//
//fun descendingTriangle(height: Int) {
//    for (i in height downTo 1) {
//        println(i)
//    }
//}
//
//fun isoscelesTriangle(width: Int) {
//    ascendingTriangle(width - 1)
//    descendingTriangle(width)
//}

/*
Function for printing triangle area
 */
//fun triangleArea(width: Double, height: Double): Double {
//     return width * height/ 2
//}

/*
Function returning bigger of two Ints
 */
//fun biggerOf(a: Int, b: Int): Int {
//    if (a > b){
//        return a
//    }
//    return b
//}

/*
Exercise practice
 */
//var score = 0
//fun getPoints(basePoints: Int, boost: Int): Int = basePoints * boost


fun main(){
    /*
    implementation of the printing triangle
     */
//    println("Ascending Triangle: ")
//    ascendingTriangle(5)
//    println("Descending Triangle: ")
//    descendingTriangle(5)
//    println("Isosceles Triangle: ")
//    isoscelesTriangle(5)
    /*
    implementation of printing area
    */
//    val area: Double = triangleArea(1.0, 2.0)
//    println(area) // 1.0
//    println(triangleArea(2.0, 2.0)) // 2.0
//    println(triangleArea(5.0, 5.0)) // 12.5
//    println(triangleArea(10.0, 20.0)) // 100.0

    /*
    implementation of bigger of function
     */
//    println(biggerOf(3,5))
//    println(biggerOf(4, 1))

    /*
    Exercise solution
     */
//    println(score)
//    score += getPoints(10,1)
//    println(score)
//    score += getPoints(20,2)
//    println(score)
//    score += getPoints(-10,1)
//    println(score)
//    score += getPoints(5,3)
//    println(score)
//    score += getPoints(-15,2)

}