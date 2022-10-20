class Comment(
    val userID: Int,
    val message: String
)

fun main() {

    // List of comments by users
    val comments = listOf(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What's going on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone, :)")
    )

    // Set of blocked users
    val blockedUserIds = setOf(
        5224,
        9001
    )

    // Relation between author of comments and user
    val userIdToRelation = mapOf(
        5241 to "Friend",
        6624 to "Work Colleague"
    )

    for (i in comments) {
        // This is the way I did it.
        if (i.userID !in blockedUserIds) {
//            if (userIdToRelation.containsKey(i.userID)){
//                println("Comment: ${i.message} from ${userIdToRelation[i.userID]}")
//        }  else {
//            println("Comment: ${i.message} from unknown")
//            }
            // The way the solution shows
            //We can use the Elvis operator ?: . It would be the same result as if you used an if –else statement.
            val relation = userIdToRelation[i.userID] ?: "unknown"
            println("Comment: ${i.message} from unknown")
        }
    }
}