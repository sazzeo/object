package com.jy.object.phonebill;

import com.jy.object.movie.Money;

public class TaxablePolicy extends AdditionalRatePolicy {

    private final double taxRatio;

    public TaxablePolicy(final double taxRatio, final RatePolicy next) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculate(final Money fee) {
        return fee.times(1 + taxRatio);
    }

}
