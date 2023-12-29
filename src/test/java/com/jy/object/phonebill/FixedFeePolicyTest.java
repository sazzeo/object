package com.jy.object.phonebill;

import com.jy.object.movie.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.event.MouseEvent;
import java.time.Duration;
import java.time.LocalDateTime;


class FixedFeePolicyTest {
    private final Call call = new Call(LocalDateTime.now() , LocalDateTime.now().plusSeconds(30));
    @Test
    @DisplayName("고정 요금 방식을 테스트한다.")
    void test() {
        FixedFeePolicy fixedFeePolicy = new FixedFeePolicy(Money.wons(18), Duration.ofSeconds(10));
        Money money = fixedFeePolicy.calculateCallFee(call);
        Assertions.assertThat(money).isEqualTo(Money.wons(54));
    }
}