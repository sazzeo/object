package com.jy.object.movie;

import java.util.List;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(final Money discountAmount,final List<DiscountCondition> discountConditions) {
        super(discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(final Screening screening) {
       return this.discountAmount;
    }
}
