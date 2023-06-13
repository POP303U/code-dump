import kotlin.math.sqrt

val invSqrt ={x: Float -> 1 / sqrt(x) }

fun inverseSqrt(x: Float): Float {
    var x = x
    val xhalf = 0.5F * x
    var i = x.toRawBits()
    i = 0x5f3759df - (i shr 1)
    x = Float.fromBits(i)
    x *= 1.5F - xhalf * x * x
    return x
}

fun main() {
    for (i in 0..100) {
        println("$i ${String.format("%.2f",invSqrt(i.toFloat()))}    $i ${String.format("%.2f",inverseSqrt(i.toFloat()))}")
        //println("$i ${inverseSqrt(i.toFloat())}     $i ${invSqrt(i.toFloat())}")
        if (String.format("%.2f",invSqrt(i.toFloat())) != String.format("%.2f",inverseSqrt(i.toFloat()))) {
            println("wrong")
        }
    }

    println(String.format("%.1f",0.36134141))
}