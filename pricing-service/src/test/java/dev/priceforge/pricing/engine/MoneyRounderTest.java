package dev.priceforge.pricing.engine;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class MoneyRounderTest {

    // Rows from SPEC §4.2
    @ParameterizedTest
    @CsvSource({
            "11.058, 11.06",
            "10.1752, 10.18",
            "10.1745, 10.17",
            "10.6176, 10.62",
            "12.00, 12.00"
    })
    void validatesRounding(BigDecimal actual, BigDecimal expected) {
        assertThat(MoneyRounder.roundOff(actual)).isEqualByComparingTo(expected);
    }

    // BigDecimal.equals compares scale too, so money assertions use isEqualByComparingTo
    @Test
    void equalsComparesScaleButCompareToDoesNot() {
        assertThat(new BigDecimal("12.0")).isNotEqualTo(new BigDecimal("12.00"));
        assertThat(new BigDecimal("12.0")).isEqualByComparingTo(new BigDecimal("12.00"));
    }

}
