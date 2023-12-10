package com.jy.object.phonebill;

import com.jy.object.movie.Money;

import java.time.Duration;
import java.util.List;

public class Phone {
    private List<Call> calls;
    private RatePolicy ratePolicy;

    public Phone(final List<Call> calls, final RatePolicy ratePolicy) {
        this.calls = calls;
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return calls;
    }
}