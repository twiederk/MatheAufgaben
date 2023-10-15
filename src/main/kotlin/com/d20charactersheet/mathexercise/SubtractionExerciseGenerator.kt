package com.d20charactersheet.mathexercise

import kotlin.random.Random

class SubtractionExerciseGenerator(
    private val random: Random = Random,
    private val max: Int = 1000
) : ExerciseGenerator {

    override fun createExercise(): Exercise {
        val minuend = random.nextInt(max)
        val subtrahend = random.nextInt(minuend)
        val result = minuend - subtrahend

        return Exercise(
            argument1 = minuend,
            argument2 = subtrahend,
            operator = "-",
            result = result
        )
    }

}

