package com.jy.object.movie;

import java.util.List;

public class PercentDiscountPolicy extends DiscountPolicy {


    private double percent;

    public PercentDiscountPolicy(final double percent,final List<DiscountCondition> discountConditions) {
        super(discountConditions);
        this.percent =percent;
    }

    @Override
    protected Money getDiscountAmount(final Screening screening) {
       return screening.getMovieFee().times(percent);
    }

}
