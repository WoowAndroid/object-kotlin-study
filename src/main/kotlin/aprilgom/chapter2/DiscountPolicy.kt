package aprilgom.chapter2

interface DiscountPolicy {
    fun calculateDiscountAmount(screening: Screening): Money
}
