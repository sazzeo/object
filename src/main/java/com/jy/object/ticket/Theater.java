package com.jy.object.ticket;


//극장
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(final TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }


    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
