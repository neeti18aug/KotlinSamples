package com.example.mykotlinsample1

fun main(arg: Array<String>) {

    val myAnimal = AnimalX()
    println(myAnimal.fight())

    val myTiger = Tiger()
    println(myTiger.fight())

    val myCar = Car2()
    myCar.name = "Ciaz"
    myCar.power = 400
    myCar.numberOfWheels = 20
    myCar.speed = 130
    println(myCar.name)
    println(myCar.power)
    println(myCar.numberOfWheels)
    println(myCar.speed)

    val myCar2 = Car2()
    println("one=" + Car2().power)
    println("two=" + myCar2.power)

    val myPerson = Person()
    myPerson.name = "Neeti"
    println(myPerson.name)

    val myStudent = Student()
    myStudent.name = "Hemu"
    println(myStudent.name)
    myStudent.studentID = 202
    println(myStudent.studentID!!)

    val myComputer: ComputerX = Nexus()
    println("UpCasting==" + myComputer.computerName)
    val myNexusOne: Nexus = ComputerX() as Nexus
    println("DownCasting==" + myNexusOne.computerName)

    val myKickBoxer = KickBoxer(20, 40, 87)
    println(myKickBoxer.kickSpeed)
    println(myKickBoxer.kickPower)

    myKickBoxer.fight()

    val myNexus = NexusClass()
    println(myNexus.getName() + "-" + myNexus.getRam() + "-" + myNexus.getCPU())

    val iPhoneClass = IphoneClass()
    println(iPhoneClass.getName() + "-" + iPhoneClass.getRam() + "-" + iPhoneClass.getCPU())

    val myLion = LionClass()
    println(myLion.getName() + "-" + myLion.getLionSpped())

    val myTigerOne = TigerClass()
    println(myTigerOne.getName() + "-" + myTigerOne.getSpeed())

    println(GameStatus.WON)
    println(GameStatus.LOSS)
    println(Feel.GOOD)
    println(Feel.BAD)
    println(Feel.OK)

    GenericAnimalClass("Lion")
    GenericAnimalClass(true)

    val intArray = ArrayList<Int>()
    intArray.add(5)
    intArray.add(12)
    intArray.add(32)
    addTwoNumbers(intArray[1], intArray[2])
}

fun addTwoNumbers(number1: Int, number2: Int): Int {
    val result = number1 + number2
    println(result)
    return result
}

class GenericAnimalClass<T>(kind: T) {
    init {
        println(kind)
    }
}

enum class GameStatus {
    WON,
    LOSS
}

enum class Feel {
    GOOD,
    BAD,
    OK
}

abstract class AnimalClass {
    abstract fun getName(): String

    open fun getSpeed(): Int {
        return 2000
    }
}

class LionClass : AnimalClass() {

    override fun getName(): String {
        return "Lion"
    }

    fun getLionSpped(): Int {
        return getSpeed()
    }
}

class TigerClass : AnimalClass() {

    override fun getName(): String {
        return "Tiger"
    }

    override fun getSpeed(): Int {
        return 5000
    }
}

interface ComputerInterface {
    fun getName(): String
    fun getRam(): String
    fun getCPU(): String
}

class NexusClass : ComputerInterface {
    override fun getName(): String {
        return "Nexus 6"
    }

    override fun getRam(): String {
        return "256GB"
    }

    override fun getCPU(): String {
        return "Snapdragon"
    }
}

class IphoneClass : ComputerInterface {
    override fun getCPU(): String {
        return "core"
    }

    override fun getName(): String {
        return "name"
    }

    override fun getRam(): String {
        return "ram"
    }
}

open class BoxerX {
    var name: String = ""

    fun throwPunch() {
        println("The Boxer is throwing punch")
    }
}

class KickBoxer(var kickSpeed: Int, var kickPower: Int, numberOfMatchesWon: Int) :
    BoxerX() {

    fun fight() {
        super.throwPunch()
        println("Kick boxer is fighting")
    }

    init {
        println(numberOfMatchesWon)
    }
}

open class ComputerX {
    var computerName: String = "Nexus"
}

class Nexus : ComputerX()

open class Person {
    open var name: String? = null
    open var age: Int? = null
    open var height: Int? = null
}

class Student : Person() {
    override var name: String? = null
    override var age: Int? = null
    override var height: Int? = null
    var studentID: Int? = null
}

class Car2 {
    var speed: Int = 0
    var power: Int = 0
    var name: String = ""
    var numberOfWheels: Int = 0
}

open class AnimalX {
    var name: String = ""
    open fun fight() {
        println("Animal is fighting")
    }
}

class Tiger : AnimalX() {
    override fun fight() {
        println("Tiger is fighting")
    }
}