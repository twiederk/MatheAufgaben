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
        assertThat(subtractionExercise.minuend).isEqualTo(965)
        assertThat(subtractionExercise.subtrahend).isEqualTo(741)
        assertThat(subtractionExercise.result).isEqualTo(224)
    }

}