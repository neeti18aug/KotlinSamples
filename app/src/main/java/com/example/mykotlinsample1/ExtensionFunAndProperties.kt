package com.example.mykotlinsample1


fun main(arg: Array<String>){
    //var myDog = Dog("Champ", "Pomeranian", 13)
    //println(printDogInformation())
    // DogExtensionKt.printDogInformation(dog);
    // val dog : Dog? = null
    // dog.printInformation() // prints "No dog found"
   /* var myDog = Dog("Champ", "Pomeranian", 13)
    if(myDog.isReadyToAdopt)
        println("Meet ${myDog.name} a ${myDog.age} year old ${myDog.breed}")*/
    val superman = Hero()
    superman.saveClass()

}

class Hero {
    fun useSuperpowers() {
        println("Applied super powers")
    }
}

fun Hero.saveClass(){
   useSuperpowers()
}

data class Dog(val name: String, val breed: String, val age: Int){}

/*fun Dog.printDogInformation(){
    println("Meet $this.name, a ${this.age} year old ${this.breed}")
}*/

fun Dog?.printInformation() {
    if (this == null){
        println("No dog found")
        return
    }
    println("Meet ${this.name} a ${this.age} year old ${this.breed}")
}

//val Dog.isReadyToAdopt: Boolean
//    {get() = this.age > 1}
