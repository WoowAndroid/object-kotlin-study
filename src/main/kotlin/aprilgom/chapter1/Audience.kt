package aprilgom.chapter1

class Audience(
    private val bag: Bag
){
    //자신의 소지품을 스스로 관리한다.
    fun buy(ticket: Ticket): Long {
        if(bag.hasInvitation()) {
            bag.ticket = ticket
            return 0
        } else {
            bag.ticket = ticket
            bag.minusAmount(ticket.fee)
            return ticket.fee
        }
    }
}

