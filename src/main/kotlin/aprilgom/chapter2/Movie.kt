package aprilgom.chapter2

import kotlin.time.Duration

class Movie(
    private val title: String,
    private val runningTime: Duration,
    val fee: Money,
    private val discountPolicy: DiscountPolicy,
) {
    fun calculateMovieFee(screening: Screening) =
        fee.minus(discountPolicy.calculateDiscountAmount(screening))
}
