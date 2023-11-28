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

    public boolean hasTicket() {
        return this.ticket != null;
    }

    public boolean hasInvitation() {
        return this.invitation != null;
    }

    public void setTicket(final Ticket ticket) {
        this.ticket = ticket;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
