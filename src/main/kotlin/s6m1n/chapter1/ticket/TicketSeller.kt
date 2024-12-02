package s6m1n.chapter1.ticket

class TicketSeller(private val ticketOffice: TicketOffice) {
    fun sellTo(audience: Audience) {
        val ticket = ticketOffice.getTicket()
        val fee = audience.buy(ticket)
        ticketOffice.plusAmount(fee)
    }
}
