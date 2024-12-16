package aprilgom.chapter2

import java.time.DayOfWeek
import java.time.LocalDateTime

class PeriodCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalDateTime,
    private val endTime: LocalDateTime,
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean =
        screening.whenScreened.dayOfWeek == dayOfWeek &&
                startTime <= screening.whenScreened &&
                endTime >= screening.whenScreened
}
