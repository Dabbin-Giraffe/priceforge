package dev.priceforge.pricing.engine;

import java.math.BigDecimal;

import dev.priceforge.contracts.Category;
import dev.priceforge.contracts.Segment;

public record LineToPrice(Segment segment, Category category, int quantity, BigDecimal unitListPrice) {

}
