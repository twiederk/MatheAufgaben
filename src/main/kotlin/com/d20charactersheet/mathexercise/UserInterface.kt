package com.d20charactersheet.mathexercise

class UserInterface {

    fun createTitle() = """
        =======================
        = Mathematik Aufgaben =
        =======================
    
        Drücke 'x' um das Programm zu beenden
    
    
    """.trimIndent()

    fun createEnd(): String = "Program beendet."
}