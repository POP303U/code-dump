class CoffeeMachine(_coffeeInMachine: Boolean, _coffee: String) {
    var coffeeInMachine = _coffeeInMachine
    var coffee = _coffee

    init {
        if (coffeeInMachine) {
            println("You have $coffee beans in your coffee machine")
        } else {
            println("Your coffee machine needs coffee to work correctly")
        }
    }

    fun printMessage() {
        println("Coffee: $coffee")
    }
}