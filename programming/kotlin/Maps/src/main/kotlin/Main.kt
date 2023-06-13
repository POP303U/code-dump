var languages = mapOf(1 to "C++", 2 to "Kotlin", 3 to "Java", 4 to "Zig", 5 to "Rust")

fun main() {
    languages.forEach { (k, v) ->
        println("key: $k value: $v")
    }
}