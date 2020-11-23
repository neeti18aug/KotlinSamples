package com.example.mykotlinsample1

sealed class Color{
    class Red : Color()
    class Orange : Color()
    class Blue : Color()
    class White : Color()
}
fun eval(c: Color) =
        when (c) {
            is Color.Red -> println("Paint in Red Color")
            is Color.Orange -> println("Paint in Orange Color")
            is Color.Blue -> println("Paint in Blue Color")
            is Color.White -> println("Paint in Blue Color")
            //else -> println("Paint in any Color")
        }

fun main(args: Array<String>) {
    val r = Color.Red()
    eval(r)
}