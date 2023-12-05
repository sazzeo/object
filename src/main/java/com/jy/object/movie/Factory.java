package com.jy.object.movie;

import com.jy.object.movie.discount.PercentAbstractDiscountPolicy;
import com.jy.object.movie.discount.SequenceCondition;

import java.time.Duration;
import java.util.List;

public class Factory {

    public Movie createAvartarMovie() {
        return new Movie("아바타",
                Money.wons(12000),
                Duration.ofMillis(120),
                new PercentAbstractDiscountPolicy(0.1, List.of(new SequenceCondition(10))));
    }
}
