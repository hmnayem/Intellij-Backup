package kotlinss


object SingletonKotlin {

    private var count = 0

    fun doSomething(): Unit {
        println("Calling a doSomething() (${++count} call/-s in total)")
    }
}