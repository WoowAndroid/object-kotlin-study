package aprilgom.chapter1

class Bag(
    private var amount: Long = 0
) {
    constructor(
        invitation: Invitation,
        amount: Long
    ): this(amount){
        this.invitation = invitation
    }

    private var ticket: Ticket? = null
    private var invitation: Invitation? = null

    fun hold(ticket: Ticket): Long {
        if(hasInvitation()) {
            this.ticket = ticket
            return 0
        } else {
            this.ticket = ticket
            minusAmount(ticket.fee)
            return ticket.fee
        }
    }
    private fun hasInvitation() = invitation != null

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }
}
