package kotlinss

fun main(args: Array<String>) {

    var single = SingletonKotlin

    single.doSomething()
    single.doSomething()
    single.doSomething()

    var single2 = SingletonKotlin
    single2.doSomething()

    var single3 = SingletonKotlin
    single3.doSomething()

    single.doSomething()

    println(getSex(0))


}


fun getSex(num: Int) = if(num == 0) "Female" else "Male"
