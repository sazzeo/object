package com.jy.object.movie_data;

import com.jy.object.movie.DiscountPolicy;
import com.jy.object.movie.Money;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;

    private List<DiscountCondition> discountConditions; //할인 조건
    private MovieType movieType; //할인 정책
    private Money discountAmount;
    private double discountPercent;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Duration getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(final Duration runningTime) {
        this.runningTime = runningTime;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(final Money fee) {
        this.fee = fee;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }

    public void setDiscountConditions(final List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(final MovieType movieType) {
        this.movieType = movieType;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(final Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(final double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Money calculateAmountDiscountedFee() {
        if(movieType != MovieType.AMOUNT_DISCOUNT) {
            throw new IllegalArgumentException("가격 할인 조건이 아닙니다.");
        }
        
        return this.fee.minus(discountAmount);
    }


    public Money calculatePercentDiscountedFee() {
        if(movieType != MovieType.PERCENT_DISCOUNT) {
            throw new IllegalArgumentException("순번 할인 조건이 아닙니다.");
        }

        return this.fee.times(discountPercent);
    }

    public Money calculateNonDiscountedFee() {
        if(movieType != MovieType.NONE_DISCOUNT) {
            throw new IllegalArgumentException("할인 조건이 존재합니다.");
        }
        return this.fee;
    }

    public boolean isDiscountable(LocalDateTime whenScreend, int sequence) {
        for (DiscountCondition discountCondition : discountConditions) {
            if(discountCondition.isDiscountable(whenScreend.getDayOfWeek() , whenScreend.toLocalTime())) {
                return true;
            }

            if(discountCondition.isDiscountable(sequence)) {
                return true;
            }
        }
        return false;
    }

}
