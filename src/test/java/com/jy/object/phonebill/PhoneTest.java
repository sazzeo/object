package com.jy.object.phonebill;

import com.jy.object.movie.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

class PhoneTest {
    @Test
    @DisplayName("요금 계산 테스트")
    void test() {
        Phone phone = new Phone(Money.wons(10), Duration.ofSeconds(10),
                List.of(new Call(LocalDateTime.now() , LocalDateTime.now().plusMinutes(1))));

        Assertions.assertThat(phone.calculateFee()).isEqualTo(Money.wons(60));
    }
}