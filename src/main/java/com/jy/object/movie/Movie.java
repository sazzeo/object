package com.jy.object.movie;

import java.time.Duration;

//영화
public class Movie {
    private String title;
    private Money fee; //가격
    private Duration runningTime; //러닝타임
    private DiscountPolicy discountPolicy; //할인 정책

    public Movie(final String title, final Money fee, final Duration runningTime, final DiscountPolicy discountPolicy) {
        this.title = title;
        this.fee = fee;
        this.runningTime = runningTime;
        this.discountPolicy = discountPolicy;

    }

    public Money calculateMovieFee(Screening screening) {
        if (this.discountPolicy == null) {
            return this.fee;
        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public Money getFee() {
        return this.fee;
    }
}
