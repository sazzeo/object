package com.jy.object.movie;

import java.util.List;

public class AmountAbstractDiscountPolicy extends AbstractDiscountPolicy {

    private Money discountAmount;

    public AmountAbstractDiscountPolicy(final Money discountAmount, final List<DiscountCondition> discountConditions) {
        super(discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(final Screening screening) {
       return this.discountAmount;
    }
}
