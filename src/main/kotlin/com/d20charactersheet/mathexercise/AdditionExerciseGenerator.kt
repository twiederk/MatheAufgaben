package com.d20charactersheet.mathexercise

import kotlin.random.Random

class AdditionExerciseGenerator(
    private val random: Random = Random,
    private val max: Int = 1000
) : ExerciseGenerator {

    override fun createExercise(): Exercise {
        val summandA = random.nextInt(max)
        val summandB = random.nextInt(max - summandA)
        val result = summandA + summandB
        return Exercise(
            argument1 = summandA,
            argument2 = summandB,
            operator = "+",
            result = result
        )
    }

}

