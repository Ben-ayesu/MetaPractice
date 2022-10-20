fun main() {
    // Practice Basic Types and Variables Exercise
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3

    val boostMultiplier = 4
    val scoreBoost = totalScore * boostMultiplier
    val finalBoostScore = totalScore + scoreBoost

    println("Total Score: $totalScore")
    println("Average Score: $averageScore")
    println("Score Boost: $scoreBoost")
    println("Final Score: $finalBoostScore")
    println()

    val myString = "Benjamin"
    println(myString.length)
    println(myString.startsWith("Ben"))
    println(myString.substring(2))
    println(myString.endsWith("min"))

}