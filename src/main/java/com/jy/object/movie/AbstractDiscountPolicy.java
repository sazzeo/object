package com.jy.object.movie;

import java.util.List;

public abstract class AbstractDiscountPolicy implements DiscountPolicy{

    private final List<DiscountCondition> discountConditions;

    public AbstractDiscountPolicy(final List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public Money calculateDiscountAmount(final Screening screening) {
        for (DiscountCondition discountCondition : discountConditions) {
            if(discountCondition.isSatisfiedBy(screening)) {
                return this.getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(final Screening screening);
}
