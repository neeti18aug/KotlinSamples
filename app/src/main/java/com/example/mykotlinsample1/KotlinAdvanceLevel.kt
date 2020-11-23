package com.example.mykotlinsample1

import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>){

    //******* Exception Handling ******
    /*println("Please Enter an Integer value")
    try{
        var myIntegerValue: Int = readLine()!!.toInt()
        println(myIntegerValue)
    }
    catch(myException: Exception)
    {
        myException.printStackTrace()
    }*/

    //******* Writing/Reading from External file  ******
    //writeToexternalFile("my name is Neeti and I am trying to edit this document..")
    //var input = readLine().toString()
    //writeToexternalFile(input)
    readFromTheExternalFile()
}

//******* Writing/Reading from External file  ******
fun writeToexternalFile(text: String){

    try {
        var fileWriter: FileWriter = FileWriter("ExternalFile.txt")
        fileWriter.write(text)
        fileWriter.close()
        println("The text is saved")
    } catch(e: Exception)
    {
        println(e.message)
    }
}
fun readFromTheExternalFile(){

    try {
        var fileReader: FileReader = FileReader("ExternalFile.txt")
        var counter: Int?

        do {
            counter = fileReader.read()
            print(counter.toChar())
        } while (counter != -1)
    }catch(e: Exception){
        println(e.message)
    }


}
