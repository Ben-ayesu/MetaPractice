fun main() {
    bankSystemInterface()

    // Variables for account type and user input
    var accountType = ""

    while (accountType.isNullOrEmpty()) {
        println("Choose an option (1, 2, or 3)")
        accountType = when (readln().toInt()) {
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> continue
        }
        println("You have created a $accountType account.")
    }
}

// Creating initial bank interface
fun bankSystemInterface() {
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit")
    println("2. Credit account")
    println("3. Checking account")
}