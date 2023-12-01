package com.jy.object.movie.discount;

import com.jy.object.movie.DiscountCondition;
import com.jy.object.movie.Screening;

public class SequenceCondition implements DiscountCondition {

    private final int sequence;

    public SequenceCondition(final int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(final Screening screening) {
        return screening.isSequence(this.sequence);
    }
}
