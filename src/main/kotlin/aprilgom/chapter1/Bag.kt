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

    var ticket: Ticket? = null
    var invitation: Invitation? = null
    fun hasTicket() = ticket != null
    fun hasInvitation() = invitation != null
    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }
}
