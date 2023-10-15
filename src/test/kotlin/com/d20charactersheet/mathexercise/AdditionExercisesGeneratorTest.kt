package com.d20charactersheet.mathexercise

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.random.Random

class AdditionExercisesGeneratorTest {

    @Test
    fun should_create_addition_exercise() {

        // act
        val additionExerciseGenerator = AdditionExerciseGenerator(Random(1)).createExercise()

        // assert
        assertThat(additionExerciseGenerator.argument1).isEqualTo(965)
        assertThat(additionExerciseGenerator.argument2).isEqualTo(21)
        assertThat(additionExerciseGenerator.result).isEqualTo(986)
    }


}