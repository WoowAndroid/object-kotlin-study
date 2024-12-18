package aprilgom.chapter2

import java.math.BigDecimal

class Money(val amount: BigDecimal) {
    fun plus(amount: Money) = Money(this.amount.add(amount.amount))
    fun minus(amount: Money) = Money(this.amount.subtract(amount.amount))
    fun times(percent: Double) = Money(this.amount.multiply(BigDecimal.valueOf(percent)))
    fun isLessThan(other: Money) = amount < other.amount
    fun isGreaterThanOrEqual(other: Money) = amount >= other.amount
    companion object{
        val ZERO = Money.wons(0)
        fun wons(amount: Long) = Money(BigDecimal.valueOf(amount))
    }
}
