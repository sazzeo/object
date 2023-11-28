package com.jy.object.ticket;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(final Long amount) {
        this.amount = amount;
    }

    public Bag(final Long amount, final Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (this.hasInvitation()) {
            this.setTicket(ticket);
            return 0L;
        }else {
            this.setTicket(ticket);
            this.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasTicket() {
        return this.ticket != null;
    }

    private boolean hasInvitation() {
        return this.invitation != null;
    }

    private void setTicket(final Ticket ticket) {
        this.ticket = ticket;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
