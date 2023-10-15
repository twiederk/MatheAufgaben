package com.d20charactersheet.mathexercise

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.random.Random

class SubtractionExerciseGeneratorTest {

    @Test
    fun should_create_subtraction_exercise() {

        // act
        val subtractionExercise = SubtractionExerciseGenerator(Random(1)).createExercise()

        // assert
        assertThat(subtractionExercise.argument1).isEqualTo(965)
        assertThat(subtractionExercise.argument2).isEqualTo(741)
        assertThat(subtractionExercise.result).isEqualTo(224)
    }

}