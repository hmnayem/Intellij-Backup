package kotlinss

class InnerClasses {

    private val someField: Int = 1;
    private val lol: String = "Love"

    inner class Inner{
        private val someField: Int = 2

        fun foo(s: String) {
            println("${this@InnerClasses.lol} $s from B : ${this.someField}")
            println("${this@InnerClasses.lol} $s from B : ${this@Inner.someField}")
            println("${this@InnerClasses.lol} $s from A : ${this@InnerClasses.someField}")

        }
    }

}

fun main(args: Array<String>) {
    val bal = InnerClasses().Inner()

    bal.foo("She")
}