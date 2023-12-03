package com.jy.object.movie_data;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private DiscountConditionType discountConditionType;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public DiscountConditionType getDiscountConditionType() {
        return discountConditionType;
    }

    public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
        if (discountConditionType != DiscountConditionType.PERIOD) {
            throw new IllegalArgumentException("기간 조건이 아닙니다.");
        }
        return this.dayOfWeek.equals(dayOfWeek) &&
                this.startTime.compareTo(time) <= 0 &&
                this.endTime.compareTo(time) > 0;
    }

    public boolean isDiscountable(int sequence) {
        if (discountConditionType != DiscountConditionType.PERIOD) {
            throw new IllegalArgumentException("순번 조건이 아닙니다.");
        }
        return this.sequence == sequence;
    }

    public void setDiscountConditionType(final DiscountConditionType discountConditionType) {
        this.discountConditionType = discountConditionType;
    }


    public int getSequence() {
        return sequence;
    }

    public void setSequence(final int sequence) {
        this.sequence = sequence;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(final DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(final LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(final LocalTime endTime) {
        this.endTime = endTime;
    }
}
