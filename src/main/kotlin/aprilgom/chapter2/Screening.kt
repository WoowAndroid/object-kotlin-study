package aprilgom.chapter2

import java.time.LocalDateTime

class Screening(
    private val movie: Movie,
    private val sequence: Int,
    val whenScreened: LocalDateTime,
) {
    fun isSequence(sequence: Int): Boolean = this.sequence == sequence
    fun getMovieFee() = movie.getFee()

    fun reserve(customer: Customer, audienceCount: Int): Reservation =
        Reservation(customer, this, calculateFee(audienceCount), audienceCount)

    private fun calculateFee(audienceCount: Int): Money =
        movie.calculateMovieFee(this).times(audienceCount)
}
