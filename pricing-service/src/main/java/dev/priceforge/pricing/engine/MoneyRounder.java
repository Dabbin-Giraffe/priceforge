package dev.priceforge.pricing.engine;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class MoneyRounder {

    private static final int MONEY_SCALE = 2;

    public static BigDecimal roundOff(BigDecimal input) {

        if (input == null)
            throw new IllegalArgumentException("Input cannot be null : " + input);

        return input.setScale(MONEY_SCALE, RoundingMode.HALF_UP);

    }

}
