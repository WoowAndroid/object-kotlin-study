package aprilgom.chapter1

class TicketOffice(
    private var amount: Long,
    vararg ticket: Ticket,
) {
    private val ticket = ticket.toMutableList()
    fun getTicket() = ticket.removeAt(0)
    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}
