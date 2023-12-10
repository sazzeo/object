package com.jy.object.phonebill;

import com.jy.object.movie.Money;

import java.time.Duration;

public class NightDiscountPolicy extends AbstractRatePolicy {
    private static final int LATE_NIGHT_HOUR = 22;
    private Money nightAmount;
    private Money regularAmount;
    private Duration seconds;

    public NightDiscountPolicy(final Money nightAmount, final Money regularAmount, final Duration seconds) {
        this.nightAmount = nightAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(final Call call) {
        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightAmount.times(call.getDuration().dividedBy(seconds));
        }

        return regularAmount.times(call.getDuration().dividedBy(seconds));
    }
}
