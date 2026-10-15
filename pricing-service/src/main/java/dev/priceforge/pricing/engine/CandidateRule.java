package dev.priceforge.pricing.engine;

import java.math.BigDecimal;

import dev.priceforge.contracts.Category;
import dev.priceforge.contracts.Segment;

public record CandidateRule(String code, Segment segment, Category category, Integer minQuantity, BigDecimal percentOff,
        int priority, String exclusiveGroup) {

}
