package s6m1n.chapter1.ticket

class TicketSeller(private val ticketOffice: TicketOffice) {
    fun sellTo(audience: Audience) {
        if (audience.bag.hasInvitation()) {
            val ticket: Ticket = ticketOffice.getTicket()
            audience.bag.setTicket(ticket)
        } else {
            val ticket = ticketOffice.getTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketOffice.plusAmount(ticket.fee)
            audience.bag.setTicket(ticket)
        }
    }
}
