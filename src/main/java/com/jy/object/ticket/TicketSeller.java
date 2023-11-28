package com.jy.object.ticket;


//판매원
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(final TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }


    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }

}
