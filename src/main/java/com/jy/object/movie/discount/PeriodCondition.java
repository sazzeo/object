package com.jy.object.movie.discount;

import com.jy.object.movie.DiscountCondition;
import com.jy.object.movie.Screening;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;

    private LocalTime startTime;

    private LocalTime endTime;

    public PeriodCondition(final DayOfWeek dayOfWeek, final LocalTime startTime, final LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(final Screening screening) {
        LocalDateTime startTime = screening.getStartTime();
        return this.equals(dayOfWeek) &&
                !this.startTime.isAfter(startTime.toLocalTime()) &&
                !this.endTime.isBefore(startTime.toLocalTime());

    }
}
