fun main() {
    var Stack1 = Stack()
    for (i in 0 .. 100) {
        Stack1.push(i)
        println(Stack1.stack[i])
    }
    for (i in 100 downTo 0) {
        println(Stack1.stack[i])
        Stack1.pop()
    }
}

class Stack {
    val stack = ArrayDeque(listOf(1))

    fun push(num: Int) {
        stack.addLast(num)
    }
    fun pop() {
        stack.removeLast()
    }
}