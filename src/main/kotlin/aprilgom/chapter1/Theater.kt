package aprilgom.chapter1

class Theater(
    private val ticketSeller: TicketSeller,
) {
    // 이제 enter 메서드는 sellTo 메서드를 호출하는 간단한 코드로 바뀐다.
    // 수정된 클래스 어디서도 ticketOffice에 접근하지 않는다는 사실에 주목.
    // Theater는 단지 ticketSeller의 sellTo 메시지만 알고있다.

    fun enter(audience: Audience) = ticketSeller.sellTo(audience)
}
