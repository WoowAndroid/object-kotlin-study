package aprilgom.chapter1

class TicketSeller(
    private val ticketOffice: TicketOffice
) {
    fun sellTo(audience: Audience) {
        //자신의 소지품을 스스로 관리한다.
        ticketOffice.plusAmount(
            audience.buy(ticketOffice.getTicket())
        )
    }
}
