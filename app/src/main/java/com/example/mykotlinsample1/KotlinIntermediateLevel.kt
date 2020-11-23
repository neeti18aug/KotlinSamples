package com.example.mykotlinsample1

fun main(arg : Array<String>)
{

    //****** Casting in Programming *****
    //Casting generally allows you to convert an object of a particular data type and turning it into another object type
    //Upcasting means casting to the super type(Super class)
    //Downcasting means casting to the sub type(Sub class)
    //Upcasting occurs automatically

    //****** Overriding in Programming *****
   /* var myAnimal = AnimalX()
    println(myAnimal.fight())

    var myTiger = Tiger()
    println(myTiger.fight())*/

    //****** Access Modifier *****
    //Protected are like "private", If a variable or function is declared as "protected", it can be only accessed within the subclass

    //****** Object creation *****
    /*var myCar: Car2 = Car2()
    myCar.name = "Ciaz"
    myCar.power = 400
    myCar.numberOfWheels = 20
    myCar.speed = 130
    println(myCar.name)
    println(myCar.power)
    println(myCar.numberOfWheels)
    println(myCar.speed)

    var myCar2: Car2 = Car2()
    println("one="+Car2().power)
    println("two="+myCar2.power)*/

    //****** Constructor ******
    //var myBoxer = Boxer("Mark", 2000, 3000)

    //****** Custom Constructor ******
    /* var myAnimal = Animal("abcd", "red", "130", 4000)
    println()
    var myAnimal2 = Animal(2000)*/

    //****** Inheritance ******
    /* var myPerson = Person()
    myPerson.name = "Neeti"
    println(myPerson.name)

    var myStudent = Student()
    myStudent.name = "Hemu"
    println(myStudent.name)
    myStudent.studentID = 202
    println(myStudent.studentID!!)*/

    //****** Casting in Programming ******
    /*var myComputer: ComputerX = Nexus() //Upcasting - automatically occurs
    println("Upcasting=="+myComputer.computerName)
    var myNexus: Nexus = ComputerX() as Nexus //Downcasting doesn't automatically occurs
    println("Downcasting=="+myNexus.computerName)*/

    //****** Super and This Keyword ******
    //"super" keyword is used inside a sub-class method definition to call a method defined in super class
    //Mostly we use "this" in order to explicitly refer to an instance variable
     /*var myKickBoxer: KickBoxer = KickBoxer(20, 40, 87)
     println(myKickBoxer.kickSpeed)
     println(myKickBoxer.kickPower)

     myKickBoxer.fight()*/

    //****** Interfaces ******
    //it's better than a class because we can define a single class that can implement multiple interfaces
   /* var myNexus = NexusClass()
    println(myNexus.getName() + "-" + myNexus.getRam() + "-" +myNexus.getCPU())

    var iPhoneClass = IphoneClass()
    println(iPhoneClass.getName() + "-" + iPhoneClass.getRam() + "-" +iPhoneClass.getCPU())*/

    //****** Abstract Class ******
    //Abstract classes can't be instantiated
    //Abstract classes can be subclassed
    //Subclasses must provide implementations for all of the abstract methods of the super class(the abstract class)
    //var myAnimal = AnimalClass()  //Abstract classes can't be instantiated

   /* var myLion = LionClass()
    println(myLion.getName() +"-"+myLion.getLionSpped())

    var myTiger = TigerClass()
    println(myTiger.getName() + "-"+myTiger.getSpeed())*/

    //****** Enum ******
    //Enum is a data type consisting of a set of named values called elements, members and enumerators of the type. An enumeration is a user defined
    //data type that consists of integral constants
    //We should always use enums when a variable can only take one out of small set of possible values. Ex - Good or Bad, Young or Old, Weak or Strong
    //Sad-Numb-Happy
    /*println(GameStatus.WON)
    println(GameStatus.LOSS)
    println(Feel.GOOD)
    println(Feel.BAD)
    println(Feel.OK)*/

    //****** Generics ******
    //Gereric programming is a style of programming in which algorithms are written in terms of types-to-be-specified-later that are then instantiated
    //when needed for specific types provided as parameters.
    //Code that uses generics has many benefits than non generic codes
    //Stronger type checks at compile time
    //The java compiler applies strong type checking to generic code and issues errors if the code violates type safety
    // - Fixing compiler time error is easier than fixing run time error, which can be difficult to find
    /*var myAnimal = GenericAnimalClass("Lion")
    var myAnimal2 = GenericAnimalClass(true)*/

    //****** Extension ******
    //In Object oriented programming, an extension method is a method added to an object after the original object was compiled
    //Extension method allow code written by others to be extended
    //Extension methods allow features to be implemented once in ways that enable reuse without the need for inheritance
    //With generic classes, extension methods allow implementation of behaviour that is available for all instantiations of the generic types without
    //requiring them to derive from common base class
    var intArray = ArrayList<Int>()
    intArray.add(5)
    intArray.add(12)
    intArray.add(32)
    intArray.addTwoNumbers(intArray[1], intArray[2])
}

fun ArrayList<Int>.addTwoNumbers(number1: Int, number2: Int): Int
{
    var result = number1 + number2
    println(result)
    return result
}

//****** Generics ******
class GenericAnimalClass<T>(kind: T)
{
    init{
        println(kind)
    }
}

//****** Enum ******
enum class GameStatus{
    WON,
    LOSS
}

enum class Feel{
    GOOD,
    BAD,
    OK
}

//****** Abstract Class ******
abstract class AnimalClass{
    abstract fun getName(): String

    open fun getSpeed(): Int{
        return 2000
    }
}

class LionClass: AnimalClass(){

    override fun getName(): String {
        return "Lion"
    }

    fun getLionSpped(): Int {
        return getSpeed()
    }
}

class TigerClass: AnimalClass(){

    override fun getName(): String {
        return "Tiger"
    }

    /*fun getTigerSpeed(): Int{
        return getSpeed()
    }*/

    override fun getSpeed():Int{
        return 5000
    }

}


//****** Interfaces ******
interface ComputerInterface{
    fun getName(): String
    fun getRam(): String
    fun getCPU(): String
}
//multiple classes can implement this interface

class NexusClass: ComputerInterface {
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

class IphoneClass: ComputerInterface{
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


//****** Super and This Keyword ******
open class BoxerX(numberOfmatchesWon: Int){
    var name : String = ""
    var punchSpeed : Int = 0
    var punchPower : Int = 0

    fun throwPunch(){
        println("The Boxer is throwing punch")
    }
}

class KickBoxer : BoxerX{
    var kickSpeed: Int = 0
    var kickPower: Int =0

    fun fight() {
        super.throwPunch()
        println("Kick boxer is fighting")
    }

    constructor(kickSpeed: Int, kickPower: Int, numberOfMatchesWon: Int):super(numberOfMatchesWon)
    {
        this.kickSpeed = kickSpeed
        this.kickPower = kickPower

        println(numberOfMatchesWon)
    }
}


//****** Casting in Programming ******
open class ComputerX{
    var computerName: String = "Nexus"
}

class Nexus: ComputerX(){

}

//****** Inheritance ******
open class Person(){
    var name: String?= null
    var age: Int?= null
    var height: Int?= null
}

class Student(): Person(){
   // var name: String?= null
   // var age: Int?= null
   // var height: Int?= null
    var studentID: Int?= null
}

class Employee(): Person(){
    // var name: String?= null
    // var age: Int?= null
    // var height: Int?= null
    var employeeID: Int?= null
}

class Animal(power: Int){
    init{
        println(power)
    }

    constructor(name: String, color: String, speed: String, power: Int) : this(power){
    println(name + "-" + color + "-"+ speed + "-" +power )
    }
}

class Boxer(name :  String, power : Int, speed: Int)
{
    private var name: String = ""
    private var power: Int? = null
    private var speed: Int = 0

    init{
        this.name = name
        println(name +" "+power+" "+speed)
    }

    fun getName(): String{
        return this.name
    }

}

class Car2{
    var speed: Int = 0
    var power: Int = 0
    var name: String = ""
    var numberOfWheels: Int = 0
}

//****** Overriding in Programming *****
open class AnimalX{

    var name: String = ""

    open fun fight(){
        println("Animal is fighting")
    }
}

class Tiger : AnimalX() {

    override fun fight(){
        //super.fight()
        println("Tiger is fighting")
    }
}
