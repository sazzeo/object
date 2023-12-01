package com.jy.object.movie.discount;

import com.jy.object.movie.DiscountCondition;
import com.jy.object.movie.Money;
import com.jy.object.movie.Screening;

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
