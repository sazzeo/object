package com.jy.object.movie;

import java.util.ArrayList;
import java.util.List;

public class NonDiscountPolicy extends DiscountPolicy {
    public NonDiscountPolicy() {
        super(List.of());
    }

    @Override
    protected Money getDiscountAmount(final Screening screening) {
        return Money.ZERO;
    }
}
