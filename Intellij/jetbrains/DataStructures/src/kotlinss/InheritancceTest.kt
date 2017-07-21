package kotlinss

import java.math.BigDecimal
import java.util.*

enum class CardType {
    VISA, MASTERCARD, AMEX
}

open class Payment(val amount: BigDecimal)

class CardPayment(amount: BigDecimal, val number: String, val expiryDate: Date, val type: CardType) : Payment(amount)

class CheckPayment : Payment {

    constructor(amount: BigDecimal, name: String, bankId: String) : super(amount){
        this.name = name
        this.bankId = bankId
    }

    var name: String
        get() = this.name

    var bankId: String
        get() = this.bankId

}