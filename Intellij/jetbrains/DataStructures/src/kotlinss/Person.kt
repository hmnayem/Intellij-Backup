package kotlinss

private class Person (var firstName: String, var lastName: String, var age: Int?){

    init {
        require(firstName.trim().isNotEmpty()) { "First Name Is Empty"}
        require(lastName.trim().isNotEmpty()) { "Last Name Is Empty"}

        if (age != null) {
            require(age as Int in 18..80) {"Age Should Be in Range 18 to 80"}
        }
    }

    override fun toString(): String {
        return "firstName=$firstName; lastName=$lastName; age=$age"
    }
}

fun main(args: Array<String>) {
    val person = Person("Shegufa", "Taranjum", 19)

    println(person)

    person.lastName = "Nayem"

    println(person)

}