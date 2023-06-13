fun main() {
    val p = Guy("jewel", "jamal")
    println(p.name1 + "\n" + p.name2)
    p.name3 = "jewels"
    println(p.name3)
}

class Guy(_name1: String, _name2: String) {
    var name1 = _name1
        get() {
            return field.uppercase()
        }
    var name2 = _name2
        get() {
            return field.uppercase()
        }
    var name3 = ""
        set(value) {
            field = value.uppercase()
        }
}