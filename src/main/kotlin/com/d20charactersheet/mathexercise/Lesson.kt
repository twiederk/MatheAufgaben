package com.d20charactersheet.mathexercise

import kotlin.math.min
import kotlin.random.Random

class Lesson(args: Array<String> = emptyArray()) {

    private val maxValue: Int
    private var score: Int = 0

    init {
        maxValue = readMaxValue(args)
    }

    private fun readMaxValue(args: Array<String>): Int {
        var max = 1000
        if (args.isNotEmpty()) {
            max = args[0].toInt()
        }
        return max
    }

    fun learn() {
        val additionExerciseGenerator = AdditionExerciseGenerator(max = maxValue)
        val subtractionExerciseGenerator = SubtractionExerciseGenerator(max = maxValue)

        do {
            val exerciseGenerator: ExerciseGenerator =
                selectExerciseGenerator(additionExerciseGenerator, subtractionExerciseGenerator)

            val exercise = exerciseGenerator.createExercise()
            println("[${getTitle(score)}] Was ist das Ergebnis von: ${exercise.argument1} ${exercise.operator} ${exercise.argument2}")

            val input = readlnOrNull()
            validateResult(input, exercise)

        } while (input != "x")
    }

    private fun selectExerciseGenerator(
        additionExerciseGenerator: AdditionExerciseGenerator,
        subtractionExerciseGenerator: SubtractionExerciseGenerator
    ) = if (Random.nextBoolean()) {
        additionExerciseGenerator
    } else {
        subtractionExerciseGenerator
    }

    private fun validateResult(input: String?, exercise: Exercise) {
        val intValue = input?.toIntOrNull()
        if (intValue != null) {
            if (exercise.result == intValue.toInt()) {
                println("RICHTIG!!!")
                score++
                if (score % 3 == 0) {
                    println("*** Herzlichen Glückwunsch zu deinem neuen Titel: ${getTitle(score)} ***")
                }
            } else {
                println("Leider falsch. Das richtige Ergebnis ist: ${exercise.result}")
            }
            println()
        }
    }

    fun getTitle(score: Int): String {
        val index = min(score / 3, TITLES.size - 1)
        return TITLES[index]
    }


    companion object {
        val TITLES = listOf(
            "Kindergartenkind",
            "Vorschüler",
            "Erstklässler",
            "Zweitklässler",
            "Drittklässler",
            "Viertklässler",
            "Hauptschüler",
            "Realschüler",
            "Gymnasiast",
            "Abiturient",
            "Student",
            "Lehrer",
            "Doktor",
            "Professor",
        )
    }
}
