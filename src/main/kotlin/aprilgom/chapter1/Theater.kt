package aprilgom.chapter1

class Theater(
    private val ticketSeller: TicketSeller,
) {
    fun enter(audience: Audience) = ticketSeller.sellTo(audience)
}