package aprilgom.chapter2

class PercentDiscountPolicy(
    private val percent: Double,
    vararg conditions: DiscountCondition,
) : DefaultDiscountPolicy(conditions.toList()) {
    override fun getDiscountAmount(screening: Screening): Money =
        screening.getMovieFee().times(percent)
}
