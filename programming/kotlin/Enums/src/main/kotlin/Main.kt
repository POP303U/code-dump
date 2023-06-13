fun main() {
    var direction: Direction

    while (true) {
        when (readlnOrNull()) {
            "w" -> direction = Direction.UP
            "d" -> direction = Direction.RIGHT
            "s" -> direction = Direction.DOWN
            "a" -> direction = Direction.LEFT
            else -> direction = Direction.INVALID
        }

        println(direction)
    }
}

enum class Direction {
    UP,RIGHT,DOWN,LEFT,INVALID
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}