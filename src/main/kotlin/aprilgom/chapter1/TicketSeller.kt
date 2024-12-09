package aprilgom.chapter1

class TicketSeller(
    private val ticketOffice: TicketOffice
    //ticketOffice가 private가 되었다는 사실에 주목하자.
    //이제 TicketSeller는 판매 요금을 적립하는 일을 스스로 수행할 수 밖에 없다.
    //이렇게 객체 내부의 세부적인 사항을 감추는 것을 캡슐화라고 부른다.
) {
    fun sellTo(audience: Audience) {
        if(audience.bag.hasInvitation()){
            val ticket = ticketOffice.getTicket()
            audience.bag.ticket = ticket
        } else {
            val ticket = ticketOffice.getTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketOffice.plusAmount(ticket.fee)
            audience.bag.ticket = ticket
        }
    }
}
