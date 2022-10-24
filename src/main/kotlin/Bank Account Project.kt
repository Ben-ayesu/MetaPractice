// Variables for account type and user input
var accountType = ""

// Variable for account balance and generates random account balance
var accountBalance = (0..1000).random()
val money = (0..1000).random()
var output = 0
fun main() {
    bankSystemInterface()

    output = deposit(money)
    println("You have deposited $output and you have $accountBalance")

    while (accountType.isNullOrEmpty()) {
        println("Choose an option (1, 2, or 3)")
        accountType = when (readln().toInt()) {
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> continue
        }
        println("You have created a $accountType account. It has $$accountBalance in the account and you are withdrawing $$money.")

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

// Withdrawal operations for checking and credit bank accounts
fun withdraw(amount: Int): Int {
    accountBalance -= amount
    println("You have withdrawn $amount and you have $accountBalance left")
    return amount
}

// Withdrawal operation for debit bank accounts. Can only withdraw when there is positive balance.
fun debitWithdraw(amount: Int): Int {
    return when {
        accountBalance == 0 -> {
            println("Can't withdraw, no money on this account")
            accountBalance
        }
        amount > accountBalance -> {
            println("Not enough money on this account! The checking balance is $accountBalance dollars")
            0
        }
        else -> withdraw(amount)
    }
}

// Deposit operation for checking and debit accounts
fun deposit(amount: Int): Int {
    accountBalance += amount
    println("You have deposited $amount and you have $accountBalance in the account")
    return amount
}

// Deposit operation for credit account
fun creditDeposit(amount: Int): Int {

}