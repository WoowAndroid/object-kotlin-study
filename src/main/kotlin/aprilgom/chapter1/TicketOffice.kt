package aprilgom.chapter1

class TicketOffice(
    private var amount: Long,
    vararg ticket: Ticket,
) {
    private val ticket = ticket.toMutableList()
    fun getTicket() = ticket.removeAt(0)

    fun sellTicketTo(audience: Audience) {
        //나쁜 소식: ticketOffice와 audience 사이의 의존성이 추가되었다.
        plusAmount(audience.buy(getTicket()))
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }
}
