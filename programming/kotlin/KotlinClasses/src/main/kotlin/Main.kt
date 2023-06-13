fun main() {
    var cat1 = Cat("Tim",3)
    cat1.ausgabe()
    var cat2 = Cat("Spaghetti",5)
    cat2.ausgabe()
    var cat3 = Cat("Timmy",8)
    cat3.ausgabe()

    var powerOf2 = {x: Int -> x * x}
    println(powerOf2(12))
}
