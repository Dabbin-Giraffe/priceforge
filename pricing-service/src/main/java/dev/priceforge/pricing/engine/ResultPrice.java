package dev.priceforge.pricing.engine;

import java.math.BigDecimal;
import java.util.List;

public record ResultPrice(BigDecimal unitListPrice, List<Step> steps, BigDecimal unitNetPrice, BigDecimal lineTotal) {

}
