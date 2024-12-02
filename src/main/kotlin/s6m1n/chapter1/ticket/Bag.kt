package s6m1n.chapter1.ticket

class Bag(
    private var amount: Long,
    private val invitation: Invitation? = null,
) {
    private var ticket: Ticket? = null

    fun hasInvitation(): Boolean {
        return invitation != null
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

    fun setTicket(newTicket: Ticket) {
        ticket = newTicket
    }

    fun plusAmount(increment: Long) {
        amount += increment
    }

    fun minusAmount(decrement: Long) {
        amount -= decrement
    }
}
