package com.example.mykotlinsample1

fun main(arg : Array<String>)
{

    //******** Functions returns value *******
    var returnResult = multiply(2,8)
    println(returnResult)
    println(multiply(2,10))

    //******** Set Collection *******
    /*var animalNames = setOf<String>("Lion", "Cat", "Dog", "Lion") //  doesn't allow duplicates

    for(animalNames in animalNames) {
        println(animalNames)
    }*/

    //******** HashMap of Function (Another way of creating Hashmap) *******
    /*var dictionary = hashMapOf<String,String>("hello" to "one",
            "hi" to "two")
    println(dictionary["hi"])*/

    //******** Array of Function (Array of a listOf) *******
    /*var partyNames = arrayOf("john", "lisa", "mark")
    println(partyNames[0])
    println(partyNames[1])
    println(partyNames[2])

    var partyList = listOf<String>("Anum", "Mishti", "King") //Immutable elements
    println(partyList[2])
    //partyList[1] ="Check"

    println()
    var partyListMutable = mutableListOf<String>("Guest 1","Guest 2", "Guest 3")
    partyListMutable.add("Guest 4")
    partyListMutable.remove("Guest 2")
    partyListMutable[0] = "Guest 0"

    for(mutableList in partyListMutable)
    {
        println(mutableList)
    }

    println()
    var partyArrayList = arrayListOf<String>("A", "M", "K")
    partyArrayList.add("Z")
    partyArrayList.removeAt(1)
    println()

    for(myVar in partyArrayList){
        println(myVar)
    }
    */


    //******** HashMap *******
    /*var dictionary = HashMap<String, String>()
    dictionary.put("hello", "hi")
    dictionary.put("nice", "good")
    dictionary.put("fantastic", "gorgeous")
    dictionary.put("support", "backup")

    println(dictionary["hello"])
    println(dictionary["Hello"])
    println(dictionary["fantastic"])
    println(dictionary.get("nice"))
    println(dictionary.get("support"))

    println()
    println("All keys")
    for(key in dictionary.keys)
        println(key)

    println()
    println("All values")
    for(value in dictionary.values)
        println(value)

    dictionary.put("added1", "one")
    println(dictionary["added1"])

    var myIntStringHashMap = HashMap<Int, String>()
    myIntStringHashMap.put(1, "Test1")

    var myStringIntHashMap = HashMap<String, Int>()
    myStringIntHashMap.put("king", 10)

    //println(myIntStringHashMap)
    //println(myStringIntHashMap)

    dictionary.remove("added1")

    println()
    println("All keys")
    for(key in dictionary.keys)
        println(key)

    println()
    println("All values")
    for(value in dictionary.values)
        println(value)
    */

  //******** ArrayList ********
    /*var partyList: ArrayList<String> = ArrayList<String>()
    partyList.add("Annie")
    partyList.add("Lisa")
    partyList.add("Rack")
    partyList.add("Mike")

    println("The first person invited to party "+partyList[0])
    println("The second person invited to party "+partyList[1])
    println("The third person invited to party "+partyList[2])
    println("The fourth person invited to party "+partyList[3])

    println()
    for(name in partyList){
        println(name)
    }

    println()
    partyList.set(2, "Misha")

    println("New List")
    for(name in partyList){
        println(name)
    }

    println()
    if(partyList.contains("Max")){
        println("Wao!! Max is also invited")
    }
    else
    {
        println("Sorry! Max not invited")
    }

    println()
    println("party list by index")

    for(index in 0..partyList.size-1){ //0 1 2 3 4
        println(partyList[index])
    }

    partyList.removeAt(2)
    println(partyList)*/

    //******** Array ********
    /*var partyNames = Array<String> (5){""}
    partyNames[0] = "Neeti"
    println(partyNames[0])
    partyNames[1] = "Rishi"
    println(partyNames[1])

    println()
    println("All party names")

    for(myVar in partyNames){
    println(myVar)
    }

    println()
    println("All party name using index")

    partyNames[2] = "A"
    partyNames[3] = "B"
    partyNames[4] = "C"

    for(myVar in 0..4){
        println(partyNames[myVar])
    }

    println()

    println("All party names invited by the user")

    for(myVar in 0..4){
        partyNames[myVar] = readLine()!!
        println(""+partyNames[myVar]+" is invited to the party")
    }
    */

    //******** for loop ********
    /* for(myNumber in 1..10){
         println("$myNumber - welcome")
    }
    */

    //******** Assignment statement ********
    /* var personAge = 20
    var personweight = 30

    var result = if(personAge > personweight) personAge else personweight
    println(result)
    */

    //******** Get input from user ********
    /* println("Enter Username")
    var userName : String = readLine().toString()
    println("Entered Password: "+userName)*/

    //Operator Precedence
    /*
    * ()
    * ^
    * * , /
    * +, -
    */
    //var myNumber = 2 * 3 + 4 / 7 * Math.pow(2.0 , 3.0) - (3 - 1)
    //println("My Number: " +myNumber)

    //******** primitive data types - byte, short, int, long, char, float, double, boolean ********

    /* var username : String?
    var password : String?

    username = readLine()
    password = readLine()

    println("User registered with : " +username+ "password : "+password)*/

    //******** When statement ********
    /*var age = 25
    when(age)
    {
        1 -> println("The value of person age is1: $age")
        //25-> println("The value of person age is2: $age")
        //25,10-> println("The value of person age is3: $age")
        //in 10..25 -> println("The value of person age is4: $age")
        //!in 30..70 -> println("The value of person age is5: $age")
        else ->{
            println("The value of person age is else: $age")
        }
    }
    */
}

fun multiply(firstNumber : Int, secondNumber: Int):Int{
    var result = firstNumber * secondNumber
    return result
}