package com.example.mykotlinsample1

data class Animals(var name: String, var species: String)

fun main(args: Array<String>){
    var animals = arrayOf(
            Animals("Poppy", "Rabbit"),
            Animals("Caro", "dog"),
            Animals("Teddy", "dog"),
            Animals("Molly", "fish"),
            Animals("Jimmy", "cat"),
            Animals("Harold", "fish"))


   /* var dogs = arrayListOf<Animals>()
    for(animal in animals){
        if(animal.species == "dog")
            dogs.add(animal)
    }
    for(animal in dogs){
       println(animal.name)
    }*/

//filter function
    var dogs = animals.filter(fun(animal):Boolean{
        return animal.species == "dog"
    })
    for(animal in dogs){
        println(animal.name)
    }

}




/*
fun safeDivide(numerator: Int, denominator: Int)=
    if(denominator== 0) 0.0 else numerator.toDouble()/denominator
*/


//val f:(Int, Int) -> Double = ::safeDivide

//using lamda expression
/*val safeDivide =  {numerator: Int, denominator: Int ->
    if(denominator== 0) 0.0 else numerator.toDouble()/denominator}

val safeDivide : (Int, Int) -> Double ={numerator, denominator ->
    if(denominator == 0) 0.0 else numerator.toDouble()/denominator
}*/

//val square: (Double) -> Double = {it * it}

/*
var triple = fun (x: Int) : Int{
    return x*3
}

var waffle = triple

waffle(30)
//Test to update github branch
*/
