package kotlinss

import java.time.DayOfWeek
import java.time.LocalDate
import java.util.*
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

enum class EnumClass {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

fun main(args: Array<String>) {

    val days: Array<DayOfWeek> = DayOfWeek.values()

    days.forEach { println(it.value) }

}