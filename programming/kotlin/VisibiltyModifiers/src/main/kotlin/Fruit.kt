open class Fruit(_fruit: String) {
    init {
        println("You chose a $_fruit")
    }
    //only visible in this module
    internal val orange = "Orange"

    //only visible in this class
    protected open val carrot = "Carrot"

    open fun sayHello() {
        println("Fruit() says hello.")
    }

    private fun helloPrivate() {
        println("I say hello privately")
    }

    protected open fun sayHelloProtected() {
        println("I say hello while I am protected")
    }
}

class SubClass(fruit: String): Fruit(fruit) {
    val item = carrot

    //helloPrivate isn't accessible

    override fun sayHello() {
        super.sayHello()
    }
    override fun sayHelloProtected() {
        println("add extra stuff")
    }
}