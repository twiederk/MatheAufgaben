package com.d20charactersheet.mathexercise

fun main(args: Array<String>) {
    print(UserInterface().createTitle())
    Lesson(args).learn()
    print(UserInterface().createEnd())
}

