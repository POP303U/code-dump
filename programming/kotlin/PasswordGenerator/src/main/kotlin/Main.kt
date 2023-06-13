const val upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
const val lowerCase = "abcdefghijklmnopqrstuvwxyz"
const val digits    = "1234567890"
const val symbols   = "()[]{},;:.-_/\\?+*#"
var password = ""

fun main(){

    print("\nHow many passwords do you want: ")
    val num = readln().toInt()
    print("How long do you want your passwords: ")
    val length = readln().toInt()

    password = (upperCase+lowerCase+digits+symbols)
    password.toCharArray()

    for (j in 0 until num) {
        println()
        for (i in 0 until length) {
            print(password.random())
        }
    }

    print("\n\nDo want to make more passwords?: (y/n) ")
    if (readln() == "y") main() else println("exiting...")
}
