package aprilgom.chapter1

class TicketSeller(
    private val ticketOffice: TicketOffice
) {
    fun sellTo(audience: Audience) {
        ticketOffice.plusAmount(
            audience.buy(ticketOffice.getTicket())
        )
    }
}
