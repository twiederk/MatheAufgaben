package com.d20charactersheet.mathexercise

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LessonTest {

    @Test
    fun should_return_first_title_when_the_score_is_0() {

        // act
        val title = Lesson().getTitle(0)

        // assert
        assertThat(title).isEqualTo("Kindergartenkind")
    }

    @Test
    fun should_return_second_title_when_the_score_is_3() {

        // act
        val title = Lesson().getTitle(3)

        // assert
        assertThat(title).isEqualTo("Vorschüler")
    }

    @Test
    fun should_return_last_title_when_score_has_exceeded_number_of_available_titles() {

        // act
        val title = Lesson().getTitle(100)

        // assert
        assertThat(title).isEqualTo("Professor")
    }

}