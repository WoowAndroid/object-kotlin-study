package aprilgom.chapter2

class AmountDiscountPolicy(
    private val discountAmount: Money,
    vararg conditions: DiscountCondition
) : DefaultDiscountPolicy(conditions.toList()) {
    override fun getDiscountAmount(screening: Screening): Money =
        discountAmount
}
