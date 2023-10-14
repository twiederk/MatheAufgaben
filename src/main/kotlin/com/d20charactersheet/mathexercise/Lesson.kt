package com.d20charactersheet.mathexercise

class Lesson(args: Array<String>) {

    private val maxValue: Int

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
        var input: String? = null

        do {
            if (kotlin.random.Random.nextBoolean()) {
                val additionExercise = additionExerciseGenerator.createExercise()
                println("Was ist das Ergebnis von: ${additionExercise.summandA} + ${additionExercise.summandB}")

                input = readlnOrNull()
                val intValue = input?.toIntOrNull()

                if (intValue != null) {
                    if (additionExercise.result == intValue.toInt()) {
                        println("RICHTIG!!!")
                    } else {
                        println("Leider falsch. Das richtige Ergebnis ist: ${additionExercise.result}")
                    }
                    println()
                }
            } else {
                val subtractionExercise = subtractionExerciseGenerator.createExercise()
                println("Was ist das Ergebnis von: ${subtractionExercise.minuend} - ${subtractionExercise.subtrahend}")

                input = readlnOrNull()
                val intValue = input?.toIntOrNull()

                if (intValue != null) {
                    if (subtractionExercise.result == intValue.toInt()) {
                        println("RICHTIG!!!")
                    } else {
                        println("Leider falsch. Das richtige Ergebnis ist: ${subtractionExercise.result}")
                    }
                    println()
                }
            }

        } while (input != "x")
    }


}
