package aprilgom.chapter1

class Theater(
    private val ticketSeller: TicketSeller,
) {
    //Audience나 TicketSeller의 내부 구현을 변경하더라도 Theater를 바꿀 필요가 없어졌다.
    fun enter(audience: Audience) = ticketSeller.sellTo(audience)
}
