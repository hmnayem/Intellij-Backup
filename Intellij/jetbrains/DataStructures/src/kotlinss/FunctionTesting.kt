@file:Suppress("UNUSED_EXPRESSION")

package kotlinss

fun main(args: Array<String>) {

    var large = largestNumber(7, 1, 4)
    println("Largest Number : $large")

    printUntilStop()
}


fun largestNumber(a: Int, b: Int, c: Int) : Int {

    fun largest(a: Int, b: Int) : Int {
        return if(a > b) a else b
    }

    return largest(largest(a, b), largest(b, c))

}

fun printUntilStop() {

    val list = listOf("a", "b", "stop", "c")

    list.forEach stop@ {
        if (it == "stop") return@stop
        else println(it)
    }
}