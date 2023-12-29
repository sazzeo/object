package com.jy.object.movie.discount;

import com.jy.object.movie.DiscountCondition;
import com.jy.object.movie.DiscountPolicy;
import com.jy.object.movie.Money;
import com.jy.object.movie.Screening;

import java.util.List;

public abstract class AbstractDiscountPolicy implements DiscountPolicy {

    private final List<DiscountCondition> discountConditions;

    public AbstractDiscountPolicy(final List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public Money calculateDiscountAmount(final Screening screening) {

        checkPrecondition(screening);

        for (DiscountCondition discountCondition : discountConditions) {
            if (discountCondition.isSatisfiedBy(screening)) {
                Money discountAmount = this.getDiscountAmount(screening);
                checkPostcondition(discountAmount);
                return discountAmount;
            }
        }
        return Money.ZERO;
    }

    //사후 조건
    private void checkPostcondition(final Money discountAmount) {
        assert discountAmount != null && discountAmount.isGreaterThanOrEqual(Money.ZERO);
    }

    //사전 조건
    private void checkPrecondition(final Screening screening) {
        assert screening != null;
    }


    abstract protected Money getDiscountAmount(final Screening screening);
}
