package s6m1n.chapter1.ticket

class Audience(private val bag: Bag) {
    fun buy(ticket: Ticket): Long = bag.hold(ticket)
}
