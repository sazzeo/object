package com.jy.object.movie_data;

import com.jy.object.movie.Money;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Money calculateFee(int audienceCount) {
        switch (movie.getMovieType()) {
            case PERCENT_DISCOUNT:
                if (movie.isDiscountable(whenScreened, sequence))
                    return movie.calculatePercentDiscountedFee().times(audienceCount);
            case AMOUNT_DISCOUNT:
                if (movie.isDiscountable(whenScreened, sequence))
                return movie.calculateAmountDiscountedFee().times(audienceCount);
            case NONE_DISCOUNT:
                return movie.calculateNonDiscountedFee().times(audienceCount);
        }
        return movie.calculateNonDiscountedFee().times(audienceCount);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(final Movie movie) {
        this.movie = movie;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(final int sequence) {
        this.sequence = sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public void setWhenScreened(final LocalDateTime whenScreened) {
        this.whenScreened = whenScreened;
    }
}