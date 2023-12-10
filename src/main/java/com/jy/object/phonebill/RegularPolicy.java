package com.jy.object.phonebill;

import com.jy.object.movie.Money;

import java.time.Duration;

public class RegularPolicy extends AbstractRatePolicy {

    private Money amount;
    private Duration seconds;

    @Override
    protected Money calculateCallFee(final Call call) {
        return amount.times(call.getDuration().dividedBy(seconds));
    }

}
