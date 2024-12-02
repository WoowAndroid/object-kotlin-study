package s6m1n.chapter1.ticket

class Bag(
    private var amount: Long,
    private val invitation: Invitation? = null,
) {
    private var ticket: Ticket? = null

    fun hold(ticket: Ticket): Long {
        if (hasInvitation()) {
            setTicket(ticket)
            return 0L
        } else {
            minusAmount(ticket.fee)
            setTicket(ticket)
            return ticket.fee
        }
    }

    private fun hasInvitation(): Boolean {
        return invitation != null
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

    private fun setTicket(newTicket: Ticket) {
        ticket = newTicket
    }

    fun plusAmount(increment: Long) {
        amount += increment
    }

    private fun minusAmount(decrement: Long) {
        amount -= decrement
    }
}
