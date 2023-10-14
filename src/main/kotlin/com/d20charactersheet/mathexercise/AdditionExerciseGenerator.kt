package com.d20charactersheet.mathexercise

import kotlin.random.Random

class AdditionExerciseGenerator(
    private val random: Random = Random,
    private val max: Int = 1000
) {
    fun createExercise(): AdditionExercise {
        val summandA = random.nextInt(max)
        val summandB = random.nextInt(max - summandA)
        return AdditionExercise(summandA, summandB)
    }

}

class AdditionExercise(
    val summandA: Int,
    val summandB: Int
) {
    val result = summandA + summandB
}
