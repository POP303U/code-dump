open class Person(age: Int, name: String) {
    open val applePrice = 10

    init {
        println("My name is $name")
        println("My age is $age")
    }

    open fun walk() {
        println("Walking is good for your health!")
    }
}

class CodingTeacher(age: Int, name: String): Person(age, name) {
    fun teachMaths() {
        println("I am a coding teacher and i teach code!")
        println("The price of an apple is €${(applePrice *.10).toInt()}")
    }

    override fun walk() {
        println("I hate walking!")
    }
}

class BusinessMan(age: Int, name: String): Person(age, name) {
    fun doBusiness() {
        println("I am a business man and i love to do business!")
        println("The price of an apple is $applePrice")
    }

    override fun walk() {
        super.walk()
        println("I added code to this walk() function.")
    }

    override val applePrice: Int
        get() = super.applePrice + 100
}
fun main() {

    var businessMan = BusinessMan(22,"Jamal")
    var codingTeacher = CodingTeacher(18,"Tom")

    businessMan.doBusiness()
    codingTeacher.walk()

    var a = 5; var b = 10
    var plus = { x: Int ->
        if (x == 0) println("a is equal 0")
        if (x < 0)  println("a is smaller 0")
        if (x > 0)  println("a is bigger 0")
    }
    plus(5)
}