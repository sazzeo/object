package com.jy.object.movie.discount;

import com.jy.object.movie.DiscountPolicy;
import com.jy.object.movie.Money;
import com.jy.object.movie.Screening;

import java.util.List;

public class NonAbstractDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(final Screening screening) {
        return Money.ZERO;
    }
}
