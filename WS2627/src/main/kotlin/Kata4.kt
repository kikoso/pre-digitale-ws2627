package org.example

import java.util.random.RandomGenerator
import kotlin.random.Random as KRandom
import java.util.Random as JRandom

// import kotlin.random.Random
// import java.util.Random

fun useDifferentRandomClasses() : String {
    return "Kotlin random" +
            KRandom.nextInt(2) +
            "Java random" +
            JRandom.from { 1 }
}

fun main() {
    print(useDifferentRandomClasses())
}