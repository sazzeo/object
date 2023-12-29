package com.jy.object.phonebill;

import com.jy.object.movie.Money;

import java.time.Duration;

public class FixedFeePolicy extends AbstractRatePolicy {

    private Money amount;
    private Duration seconds;

    public FixedFeePolicy(final Money amount, final Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(final Call call) {
        return amount.times(call.getDuration().dividedBy(seconds));
    }

}
