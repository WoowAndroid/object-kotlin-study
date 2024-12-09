package aprilgom.chapter1

class TicketSeller(
    private val ticketOffice: TicketOffice
) {
    //좋은 소식: ticketOffice의 sellTicketTo 인터페이스에만 의존하게 되었다
    fun sellTo(audience: Audience) = ticketOffice.sellTicketTo(audience)
}
