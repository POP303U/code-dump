var n = 0
var result = 0
var newResult = 0

fun schicksalszahl(zahl: String) {
    newResult = 0
    for (i in zahl.indices) {
        if (zahl[i] in '0'..'9') {
            result = zahl[i].digitToInt()
            newResult += result
        }
    }
    if (n != 20) {
        ++n; schicksalszahl("$newResult")
    }
}

fun main() {
    schicksalszahl("24.9.1985")
    println(newResult)
}

fun schickZahls(z: Int): Int { //28
    var zahl = z
    var qsumme = 0
    do {
        qsumme += zahl % 10 // rest 8
        zahl /= 10 // dividend 2
        qsumme += zahl // summe 10
        zahl = qsumme // zahl neu jetzt 10
        qsumme = 0 // qsumme neu jetzt 0
    } while (zahl > 9)
    return zahl
}

fun schickZahl1(zahl: Int): Int {
    var zahl = zahl
    var qsumme = 0
    while (zahl > 9) {
        qsumme += zahl % 10
        zahl /= 10
        qsumme += zahl
        if (qsumme > 9) {
            zahl = qsumme
            qsumme = 0
        } else break
    }
    return qsumme
}

fun schickZahl(datum: String): Int {
    var zahl = 0
    for (i in 0 until datum.length) {
        val c = datum[i]
        if (!(c < '0' || c > '9')) {
            zahl += c.code - '0'.code
        }
    }
    var qsumme = 0
    while (zahl > 9) {
        qsumme += zahl % 10
        zahl /= 10
        qsumme += zahl
        if (qsumme > 9) {
            zahl = qsumme
            qsumme = 0
        } else break
    }
    return qsumme
}

fun schickZahl2(zahl: Int): Int {
    var zahl = zahl
    var qsumme = 0
    return if (zahl <= 9) zahl
    else {
        qsumme += zahl % 10
        zahl /= 10
        qsumme += zahl
        zahl = qsumme
        schickZahl2(zahl)
    }
}
