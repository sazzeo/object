package com.jy.object.phonebill;

import com.jy.object.movie.Money;

public abstract class AbstractRatePolicy implements RatePolicy {
    @Override
    public Money calculateFee(final Phone phone) {
        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    protected abstract Money calculateCallFee(Call call);
}
