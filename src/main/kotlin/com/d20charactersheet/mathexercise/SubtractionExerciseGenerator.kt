package com.d20charactersheet.mathexercise

import kotlin.random.Random

class SubtractionExerciseGenerator(
    private val random: Random = Random,
    private val max: Int = 1000
) {
    fun createExercise(): SubtractionExercise {
        val minuend = random.nextInt(max)
        val subtrahend = random.nextInt(minuend)
        return SubtractionExercise(minuend, subtrahend)
    }
}

class SubtractionExercise(
    val minuend: Int,
    val subtrahend: Int
) {
    val result = minuend - subtrahend
}
