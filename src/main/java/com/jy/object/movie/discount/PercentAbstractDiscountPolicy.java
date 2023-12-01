package com.jy.object.movie.discount;

import com.jy.object.movie.DiscountCondition;
import com.jy.object.movie.Money;
import com.jy.object.movie.Screening;

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
