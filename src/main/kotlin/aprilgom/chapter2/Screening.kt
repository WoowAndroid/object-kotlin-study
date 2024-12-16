package aprilgom.chapter2

import java.time.LocalDateTime

class Screening(
    private val movie: Movie,
    private val sequence: Int,
    val whenScreened: LocalDateTime,
) {
    fun isSequence(sequence: Int): Boolean = this.sequence == sequence
    fun getMovieFee() = movie.getFee()
}
