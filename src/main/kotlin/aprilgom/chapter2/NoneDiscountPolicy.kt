package aprilgom.chapter2

class NoneDiscountPolicy: DiscountPolicy() {
    override fun getDiscountAmount(screening: Screening): Money =
        Money.ZERO
}
