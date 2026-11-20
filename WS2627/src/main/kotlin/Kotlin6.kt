package org.example



fun main() {
    val myString = "Hello"

    print(myString.world())

    Pair(1,2).r()
    1.r()
}

fun Int.r(): RationalNumber = TODO()
fun Pair<Int,Int>.r(): RationalNumber = TODO()

data class RationalNumber(val numerator: Int, val denominator: Int)


fun String.world() : String = "Hello world"

