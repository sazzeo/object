package com.jy.object.movie;

import java.util.List;

public class PercentAbstractDiscountPolicy extends AbstractDiscountPolicy {


    private double percent;

    public PercentAbstractDiscountPolicy(final double percent, final List<DiscountCondition> discountConditions) {
        super(discountConditions);
        this.percent =percent;
    }

    @Override
    protected Money getDiscountAmount(final Screening screening) {
       return screening.getMovieFee().times(percent);
    }

}
