package com.jy.object.phonebill;

import com.jy.object.movie.Money;

import java.time.Duration;
import java.util.List;

public class Phone {

    private Money amount; //n원씩 부과
    private Duration second; //n초당 부과

    private List<Call> calls;

    public Phone(final Money amount, final Duration second, final List<Call> calls) {
        this.amount = amount;
        this.second = second;
        this.calls = calls;
    }

    public Money calculateFee() {
        Money res = Money.ZERO;
        for (Call call : calls) {
            long l = call.getDuration().dividedBy(second);
            res = res.plus(amount.times(l));
        }
        return res;
    }
}