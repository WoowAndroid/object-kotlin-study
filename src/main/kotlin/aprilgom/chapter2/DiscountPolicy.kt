package aprilgom.chapter2

abstract class DiscountPolicy(
    private val discountConditions: List<DiscountCondition> = listOf()
) {
    fun calculateDiscountAmount(screening: Screening): Money =
        discountConditions.find {
            it.isSatisfiedBy(screening)
        }?.let { getDiscountAmount(screening) } ?: Money.ZERO

    protected abstract fun getDiscountAmount(screening: Screening): Money
}
