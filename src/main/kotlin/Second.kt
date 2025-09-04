fun main() {
    val y: Int = 5
    val x: Double = 2.5
    val i: Float = 3.089F
    println(i)

    val isFood: Boolean = false
    println(isFood)

    var w = 30
    w = 40
    println(w)


    var r = 10
    r -= 20
    println(r)



    val p = 20
    val u = 39
    println(p >= u)

    val areTheSame = p == u
    println(areTheSame)

    println(p % 2 == 9)

    val areBothEven = u % 2 == 0 || p % 2 == 0
    println(areBothEven)

// input
    println("please enter a number: ")
    val input = readln()
    val inputAsInterger = input.toIntOrNull() ?.inc()

    val isEven = inputAsInterger!! % 2 == 0
    println("Your input is  $inputAsInterger: ")




}