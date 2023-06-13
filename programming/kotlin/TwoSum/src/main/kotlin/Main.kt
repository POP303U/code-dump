fun main() {
    val arr = intArrayOf(2,7,11,15,12,32,14,51,29)
    val key = 44
    println(twoSum(arr,key))
}

fun twoSum(arr: IntArray, key: Int): IntArray {
    for (i in arr.indices) {
        for (j in arr.indices + 1) {
            if (arr[i] + arr[j] == key) return intArrayOf(arr[i],arr[j])
        }
    }
    return intArrayOf()
}

fun twoSum2(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException("No solution")
}
fun twoSum3(arr: IntArray, key: Int): IntArray {
    for (i in arr.indices) {
        for (j in arr.indices + 1) {
            if (arr[i] + arr[j] == key) {
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf(-1)
}

infix fun IntArray.twoSum4(key: Int): List<Int> {
    val numMap: MutableMap<Int, Int> = HashMap()
    for (i in this.indices) {
        val complement = key - this[i]
        if (numMap.containsKey(complement)) {
            return listOf(numMap[complement]!!, i)
        } else {
            numMap[this[i]] = i
        }
    }
    throw IllegalArgumentException("No solution")
}

fun binarySearch(arr: IntArray, key: Int): Int {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        var mid = left + (right - left) / 2
        when {
            arr[mid] == key -> return mid
            arr[mid] < key -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}