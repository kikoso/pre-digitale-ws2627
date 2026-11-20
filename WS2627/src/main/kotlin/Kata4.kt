package org.example

import kotlin.random.Random
import java.util.Random

// import kotlin.random.Random
// import java.util.Random

fun useDifferentRandomClasses() : String {
    return "Kotlin random" +
            KRandom.nextInt(2) +
            "Java random" +
            JRandom.nextInt(2)
}