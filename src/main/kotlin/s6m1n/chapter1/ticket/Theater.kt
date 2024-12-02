package s6m1n.chapter1.ticket

class Theater(private val ticketSeller: TicketSeller) {
    fun enter(audience: Audience) {
        ticketSeller.sellTo(audience)
    }
}
