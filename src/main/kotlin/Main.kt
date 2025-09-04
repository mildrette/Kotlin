fun main() {
    val input = readln()
    val inputAsInterger = input.toIntOrNull()
val someNumbers = intArrayOf(1, 2,3,4,5,6,7,7,8,)

    if( inputAsInterger != null) {
        println("your number is ${someNumbers[4]}")
    }
println(someNumbers.getOrNull(20))
}