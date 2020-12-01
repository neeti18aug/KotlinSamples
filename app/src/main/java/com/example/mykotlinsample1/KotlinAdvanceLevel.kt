package com.example.mykotlinsample1

import java.io.File
import java.io.FileWriter

fun main(args: Array<String>) {

    println("Please Enter an Integer value")
    try {
        val myIntegerValue: Int = readLine()!!.toInt()
        println(myIntegerValue)
    } catch (myException: Exception) {
        myException.printStackTrace()
    }

    writeToExternalFile("My name is Neeti and I am trying to edit this document..")
    val input = readLine().toString()
    writeToExternalFile(input)
    readFromTheExternalFile()
}

private fun writeToExternalFile(text: String) {

    try {
        val fileWriter = FileWriter("ExternalFile.txt")
        fileWriter.write(text)
        fileWriter.close()
        println("The text is saved")
    } catch (e: Exception) {
        println(e.message)
    }
}

private fun readFromTheExternalFile() = try {
    File("ExternalFile.txt").forEachLine { println(it) }

} catch (e: Exception) {
    println(e.message)
}
