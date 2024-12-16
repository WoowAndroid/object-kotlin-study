package aprilgom.chapter2

class AmountDiscountPolicy(
    private val discountAmount: Money,
    vararg conditions: DiscountCondition
) : DiscountPolicy(conditions.toList()) {
    override fun getDiscountAmount(screening: Screening): Money =
        discountAmount
}
