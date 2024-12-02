package s6m1n.chapter1.ticket

class TicketOffice(private var amount: Long, private val tickets: MutableList<Ticket>) {
    fun getTicket() = tickets.removeAt(0)

    fun plusAmount(increment: Long) {
        amount += increment
    }

    fun minusAmount(decrement: Long) {
        amount -= decrement
    }
}
