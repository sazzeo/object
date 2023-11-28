package com.jy.object.movie;

import java.util.List;

public abstract class DiscountPolicy {

    private final List<DiscountCondition> discountConditions;

    public DiscountPolicy(final List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public Money calculateDiscountAmount(final Screening screening) {
        for (DiscountCondition discountCondition : discountConditions) {
            if(discountCondition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(final Screening screening);
}
