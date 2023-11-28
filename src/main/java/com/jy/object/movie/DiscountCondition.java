package com.jy.object.movie;

public interface DiscountCondition {

    //할인 조건을 만족하는가?
    boolean isSatisfiedBy(Screening screening);

}
