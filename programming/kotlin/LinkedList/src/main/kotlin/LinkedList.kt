// Singly-linked-list (SLL)
// Nodes hold data that are linked together with pointers to the next Node
// The linked list uses a single head to traverse the list
// It ends if it hits 'null'

class LinkedList(vararg nums: Any) {
    // Define start of the list
    private var head: Node? = null

    // Initialize if input is given
    init { nums.forEach { addLast(it) } }

    // Add an Element to the start of the list
    fun addFirst(num: Any) {
        val newNode = Node(num)
        newNode.next = head
        head = newNode
    }

    // Add an Element to the end of the List
    fun addLast(num: Any) {
        val newTail = Node(num)
        if (head == null) { head = newTail; return }
        var current= head
        while (current?.next != null) { current = current.next }
        current?.next = newTail
    }

    // Print the list like an ArrayList
    fun printList() {
        var n = head
        var str = "["
        while (n != null) {
            str += "${n.data}, "
            n = n.next
        }
        str = str.substring(0, str.length - 2) + "]"
        println(str)
    }

    // Define a Node that holds data and a pointer to the next node
    private data class Node(var data: Any, var next: Node? = null)
}



/*  !!OLD!! This is just creating manually nodes and really bad

    // create some nodes to hold our data
    val node0 = Node(9)
    val node1 = Node(2)
    val node2 = Node(3)
    val node3 = Node(6)
    val node4 = Node(8)
    val node5 = Node(1)
    val node6 = Node(6)

    // define head of the LinkedList
    list.head = node0

    // link all nodes together except the last one: null
    node0.next = node1
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
*/