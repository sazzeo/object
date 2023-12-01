package com.jy.object.movie_data;


import com.jy.object.movie.Money;

public class ReservationAgency {

    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Movie movie = screening.getMovie();
        boolean discountable = false;
        for (DiscountCondition condition : movie.getDiscountConditions()) {
            if (condition.getDiscountConditionType() == DiscountConditionType.PERIOD) {
                discountable = screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek())
                        && condition.getStartTime().isBefore(screening.getWhenScreened().toLocalTime())
                        && condition.getEndTime().isAfter(screening.getWhenScreened().toLocalTime());

            } else {
                discountable = screening.getSequence() == condition.getSequence();
            }

            if (discountable) {
                break;
            }
        }

        Money fee = movie.getFee();
        if (discountable) {
            Money discountAmount = Money.ZERO;
            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    discountAmount = movie.getDiscountAmount();
                    break;
                case PERCENT_DISCOUNT:
                    discountAmount= movie.getFee().times(movie.getDiscountPercent());
                    break;
                case NONE_DISCOUNT:
                    break;
            }
            fee = movie.getFee().minus(discountAmount);
        }
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
