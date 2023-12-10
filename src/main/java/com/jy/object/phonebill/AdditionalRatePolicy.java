package com.jy.object.phonebill;

import com.jy.object.movie.Money;

//부가 정책
public abstract class AdditionalRatePolicy implements RatePolicy {

    private RatePolicy next; //다음 정책

    public AdditionalRatePolicy(final RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(final Phone phone) {
        Money fee = next.calculateFee(phone);
        return afterCalculate(fee);
    }

    abstract protected Money afterCalculate(Money fee);
}
