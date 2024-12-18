package aprilgom.chapter2

abstract class DefaultDiscountPolicy(
    private val discountConditions: List<DiscountCondition> = listOf()
) : DiscountPolicy {
    override fun calculateDiscountAmount(screening: Screening): Money =
        discountConditions.find {
            it.isSatisfiedBy(screening)
        }?.let { getDiscountAmount(screening) } ?: Money.ZERO
    abstract fun getDiscountAmount(screening: Screening): Money
}
