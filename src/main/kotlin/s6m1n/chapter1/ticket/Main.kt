package s6m1n.chapter1.ticket

fun main() {
    val bag = Bag(1000L)
    val audience = Audience(bag)

    val ticketOffice = TicketOffice(10000L, mutableListOf(Ticket(500L)))
    val ticketSeller = TicketSeller(ticketOffice)
    val theater = Theater(ticketSeller)

    theater.enter(audience)
}
