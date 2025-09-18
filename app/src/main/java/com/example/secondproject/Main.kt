package com.example.secondproject

fun main(){
    val name = "Mildred"
    var age = 31

    println("hello world, i am $name learning kotlin inside android studio and i am $age")

    age = 35
    println("Next year, i will be $age")
    test()
    miniProject()
    loopsTest()
}
fun test(){
    var name: String = "Mildred Fonka"
    var age: Int = 14
    var size: Double = 5.9
    val isIt: Boolean = false
    println(size)
    age = 46

    if (isIt) {
        println("$name is learning Kotlin")
    } else {
        println("$name is taking a break")
    }

    if (age < 18){
        println("$name is an child")
    } else if (age in 18..60){
        println("$name is an adult")
    } else {
        println("$name is a sinior")
    }
}
fun miniProject(){
    var name = "Favour"
    var how = 25
    val isLearning = true

     println("Hello! is your name $name?? and are you $how years old??")

if (how < 18){
    println("so your an child?? right")
} else if(how in 18..20) {
    println("emm your an adult")
} else {
    println("woow your big")
}
}



// loops
fun loopsTest(){
    val list = arrayOf("favour", "Alex", "wisdom", "vanessa")
    val figures = arrayOf(30, 60, 19, 40, 70,37, 59)

    for ( name in list){
        println("hello!, here are the $name")
    }

    for (a in list.indices){
        val list = list[a]
        val figures = figures[a]

        println("hi! here are the names: $list and the age: $figures ")
    }
}