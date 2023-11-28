package com.jy.object.movie;

public class SequenceCondition implements DiscountCondition{

    private final int sequence;

    public SequenceCondition(final int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(final Screening screening) {
        return screening.isSequence(this.sequence);
    }
}
