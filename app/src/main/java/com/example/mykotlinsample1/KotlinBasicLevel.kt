@file:Suppress("DUPLICATE_LABEL_IN_WHEN", "NAME_SHADOWING")

package com.example.mykotlinsample1

import kotlin.math.pow

fun main(arg: Array<String>) {

    val returnResult = multiply(2, 8)
    println(returnResult)
    println(multiply(2, 10))

    val animalNames = setOf("Lion", "Cat", "Dog", "Lion")
    for (animalNames in animalNames) println(animalNames)

    val partyNames = arrayOf("john", "lisa", "mark")
    println(partyNames[0])
    println(partyNames[1])
    println(partyNames[2])

    val partyListMutable: MutableList<String> =
        mutableListOf("Guest 1", "Guest 2", "Guest 3")
    partyListMutable.add("Guest 4")
    partyListMutable.remove("Guest 2")
    partyListMutable[0] = "Guest 0"

    for (mutableList in partyListMutable) {
        println(mutableList)
    }

    val partyArrayList: ArrayList<String> = arrayListOf("A", "M", "K")
    partyArrayList.add("Z")
    partyArrayList.removeAt(1)
    println()

    for (myVar in partyArrayList) {
        println(myVar)
    }

    val partyListThree: ArrayList<String> = ArrayList()
    partyListThree.add("Annie")
    partyListThree.add("Lisa")
    partyListThree.add("Rack")
    partyListThree.add("Mike")
    println("The first person invited to party " + partyListThree[0])
    println("The second person invited to party " + partyListThree[1])
    println("The third person invited to party " + partyListThree[2])
    println("The fourth person invited to party " + partyListThree[3])

    println()
    for (name in partyListThree) {
        println(name)
    }

    println()
    partyListThree[2] = "Misha"

    println("New List")
    for (name in partyListThree) {
        println(name)
    }

    println()
    if (partyListThree.contains("Max")) {
        println("Wao!! Max is also invited")
    } else {
        println("Sorry! Max not invited")
    }

    println()
    println("party list by index")

    for (index in 0 until partyListThree.size) { //0 1 2 3 4
        println(partyListThree[index])
    }

    partyListThree.removeAt(2)
    println(partyListThree)

    val partyNamesTwo = Array(size = 5) { "" }
    partyNamesTwo[0] = "Neeti"
    println(partyNamesTwo[0])
    partyNamesTwo[1] = "Rishi"
    println(partyNamesTwo[1])

    println()
    println("All party names")

    for (myVar in partyNamesTwo) {
        println(myVar)
    }

    println()
    println("All party name using index")

    partyNamesTwo[2] = "A"
    partyNamesTwo[3] = "B"
    partyNamesTwo[4] = "C"

    for (myVar in 0..4) {
        println(partyNamesTwo[myVar])
    }

    println()
    println("All party names invited by the user")

    for (myVar in 0..4) {
        partyNames[myVar] = readLine()!!
        println("" + partyNames[myVar] + " is invited to the party")
    }

    for (myNumber in 1..10) {
        println("$myNumber - welcome")
    }

    val personAge = 20
    val personWeight = 30
    val result = if (personAge > personWeight) {
        personAge
    } else personWeight
    println(result)

    println("Enter Username")
    val userName: String = readLine().toString()
    println("Entered Password: $userName")
    val myNumber: Double = 2 * 3 + 4 / 7 * 2.0.pow(3.0) - (3 - 1)
    println("My Number: $myNumber")

    val username: String? = readLine()
    val password: String? = readLine()
    println("User registered with : " + username + "password : " + password)

    when (val age = 25) {
        1 -> println("The value of person age is1: $age")
        25 -> println("The value of person age is2: $age")
        25, 10 -> println("The value of person age is3: $age")
        in 10..25 -> println("The value of person age is4: $age")
        !in 30..70 -> println("The value of person age is5: $age")
        else -> {
            println("The value of person age is else: $age")
        }
    }

    val partyArrayListNow: ArrayList<String> = arrayListOf("A", "M", "K")
    partyArrayListNow.add("Z")
    partyArrayListNow.removeAt(1)
    for (myVar in partyArrayListNow) {
        println(myVar)
    }
    partyArrayListNow.forEach { println(it) }
}

fun multiply(firstNumber: Int, secondNumber: Int): Int = firstNumber * secondNumber