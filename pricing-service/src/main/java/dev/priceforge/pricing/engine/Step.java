package dev.priceforge.pricing.engine;

import java.math.BigDecimal;

// One shape for every step type; the fields a type doesn't use are null (ARCHITECTURE §8.3)
public record Step(StepType type, String ruleCode, BigDecimal percentOff, BigDecimal amount,
        BigDecimal unitPriceAfter, String group, String supersededBy, BigDecimal capPercent) {

    public static Step applied(String ruleCode, BigDecimal percentOff, BigDecimal amount, BigDecimal unitPriceAfter) {
        return new Step(StepType.APPLIED, ruleCode, percentOff, amount, unitPriceAfter, null, null, null);
    }

    public static Step superseded(String ruleCode, BigDecimal percentOff, String group, String supersededBy) {
        return new Step(StepType.SUPERSEDED, ruleCode, percentOff, null, null, group, supersededBy, null);
    }

    public static Step cap(BigDecimal capPercent, BigDecimal amount, BigDecimal unitPriceAfter) {
        return new Step(StepType.CAP, null, null, amount, unitPriceAfter, null, null, capPercent);
    }

}
