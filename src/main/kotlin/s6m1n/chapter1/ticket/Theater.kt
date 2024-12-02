package s6m1n.chapter1.ticket

class Theater(private val ticketSeller: TicketSeller) {
    fun enter(audience: Audience) {
        if (audience.bag.hasInvitation()) {
            val ticket: Ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.setTicket(ticket)
        } else {
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketSeller.ticketOffice.plusAmount(ticket.fee)
            audience.bag.setTicket(ticket)
        }
    }
}
