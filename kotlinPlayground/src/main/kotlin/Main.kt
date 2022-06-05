// Time spent: 5 hours
// Author: Andy Gannaway
// control shift r = Run
// Kotlin types: https://kotlinlang.org/docs/basic-types.html#literal-constants
// Kotlin array: https://www.geeksforgeeks.org/kotlin-array/
// Kotlin classes: https://kotlinlang.org/docs/classes.html
fun addNums(num1: Int, num2: Int)
{
    val num3 = num1 + num2
    println("Sum of numbers given: ${num3}")
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

fun main(args: Array<String>) {

    // Kotlin variables
    println("")
    println("Variables")
    var phrase = "Hello, Andy!"
    println(phrase)

    // String literal
    var yourName = "Andy"
    println("Hello, ${yourName}!")

    // Conditionals
    println("")
    println("Conditionals")
    var a = 10
    var b = 11
    var num = 0
    if (a < b) num = b
    println("Max: ${num}")

    // Conditional with else
    num = 0
    if (a > b) {
        num = a
    } else {
        num = b
    }
    println("Max: ${num}")

    // Loops
    println("")
    println("Loops")
    for (i in 1..3) {
        println(i)
    }

    val numArray = arrayOf(1, 2, 3, 4)
    println("Array for loop:")
    for (i in numArray) {
        println(i)
    }

    // Functions
    println("")
    println("Functions")
    addNums(a,b)

    // Classes
    println("")
    println("Classes")
    class Person(
        val firstName: String,
        val lastName: String,
        var age: Int, // trailing comma
    ) {
        fun greetPerson() {
            println("Hello ${firstName} ${lastName}")
        }
    }

    val me = Person("Andy","Gannaway",29)
    println("Hello ${me.firstName} ${me.lastName}")
    println("Same greeting, but now using function method:")
    me.greetPerson()

    // Collections
    println("")
    println("Collections")
    val naturalNums = mutableListOf("one", "two", "three", "four", "five")
    naturalNums.add("six")
    println(naturalNums)
    naturalNums.remove("one")
    println(naturalNums)

    // When statements
    println("")
    println("When Statements")
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}