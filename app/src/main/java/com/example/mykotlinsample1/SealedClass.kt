package com.example.mykotlinsample1

sealed class Color {
    object Red : Color()
    object Orange : Color()
    object Blue : Color()
    object White : Color()
}

fun eval(c: Color) =
    when (c) {
        is Color.Red -> println("Paint in Red Color")
        is Color.Orange -> println("Paint in Orange Color")
        is Color.Blue -> println("Paint in Blue Color")
        is Color.White -> println("Paint in Blue Color")
    }

fun main(args: Array<String>) {
    val r = Color.Red
    eval(r)
}