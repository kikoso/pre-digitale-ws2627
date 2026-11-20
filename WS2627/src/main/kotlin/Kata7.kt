package org.example

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
}

fun checkInRange(date: MyDate, first: MyDate, second: MyDate): Boolean {
    return TODO()
}

fun main() {
    val myDate = MyDate(2016, 12, 1)


    val first = MyDate(2016, 6, 25)
    val second = MyDate(2017, 6, 27)

    if (first < second) {
        println("First is less than second")
    }
}