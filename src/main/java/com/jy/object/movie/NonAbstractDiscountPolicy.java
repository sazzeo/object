package com.jy.object.movie;

import java.util.List;

public class NonAbstractDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(final Screening screening) {
        return Money.ZERO;
    }
}
