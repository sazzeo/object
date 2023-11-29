package movie;

import com.jy.object.movie.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class MovieTest {

    @Test
    @DisplayName("퍼센트 할인 정책 테스트")
    void test() {
        Movie 아바타 = new Movie("아바타", Money.wons(12000), Duration.ofMillis(120),
                new PercentDiscountPolicy(0.1, List.of(new SequenceCondition(10))));

        Screening screening = new Screening(아바타, 10, LocalDateTime.now());
        Money money = screening.calculateFee(10);

        Assertions.assertThat(money).isEqualTo(Money.wons(108000));

    }
}
