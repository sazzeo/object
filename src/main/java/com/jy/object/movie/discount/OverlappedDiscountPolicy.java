package com.jy.object.movie.discount;

import com.jy.object.movie.DiscountPolicy;
import com.jy.object.movie.Money;
import com.jy.object.movie.Screening;

import java.util.List;

public class OverlappedDiscountPolicy implements DiscountPolicy {

    private List<DiscountPolicy> discountPolicies;

    public OverlappedDiscountPolicy(final List<DiscountPolicy> discountPolicies) {
        this.discountPolicies = discountPolicies;
    }

    @Override
    public Money calculateDiscountAmount(final Screening screening) {
        Money discountAmount = Money.ZERO;
        for (DiscountPolicy discountPolicy : discountPolicies) {
            discountAmount = discountAmount.plus(discountPolicy.calculateDiscountAmount(screening));
        }
        return discountAmount;
    }
}
