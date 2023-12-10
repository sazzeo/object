package com.jy.object.phonebill;

import com.jy.object.movie.Money;

public class RateDiscountablePolicy extends AdditionalRatePolicy {

    private final Money discountAmount;

    public RateDiscountablePolicy(final Money discountAmount, final RatePolicy next) {
        super(next);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculate(final Money fee) {
        return fee.minus(discountAmount);
    }
}
