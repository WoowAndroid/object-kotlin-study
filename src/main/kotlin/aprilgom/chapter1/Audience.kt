package aprilgom.chapter1

class Audience(
    private val bag: Bag
) {
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

