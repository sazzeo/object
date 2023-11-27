package com.jy.object.ticket;

//관람객
public class Audience {
    private Bag bag;

    public Audience(final Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
