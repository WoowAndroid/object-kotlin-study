package aprilgom.chapter2

class NoneDiscountPolicy : DiscountPolicy {
    override fun calculateDiscountAmount(screening: Screening): Money =
        Money.ZERO
}
