package s6m1n.chapter1.ticket

class Audience(private val bag: Bag) {
    fun buy(ticket: Ticket): Long {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket)
            return 0L
        } else {
            bag.minusAmount(ticket.fee)
            bag.setTicket(ticket)
            return ticket.fee
        }
    }
}
