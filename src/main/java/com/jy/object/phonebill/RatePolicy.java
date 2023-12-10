package com.jy.object.phonebill;

import com.jy.object.movie.Money;

//요금 정책 => 기본 요금제인지? 심야 할인 요금제인지?
public interface RatePolicy {

    Money calculateFee(Phone phone);
}
