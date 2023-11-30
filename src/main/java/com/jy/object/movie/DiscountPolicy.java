package com.jy.object.movie;

public interface DiscountPolicy {
    Money calculateDiscountAmount(final Screening screening);
}
