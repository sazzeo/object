package com.jy.object.movie;

import java.time.LocalDateTime;

//상영
public class Screening {

    private Movie movie;
    private int sequence;
    //상영 일시
    private LocalDateTime whenScreened;


    public Screening(final Movie movie, final int sequence, final LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount) , audienceCount);
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }
}
