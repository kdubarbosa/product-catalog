package com.algaworks.algashop.product.catalog.domain.model.product;

import com.algaworks.algashop.product.catalog.domain.model.category.Category;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    void shouldGenerateSlugWhenCreatedAndWhenNameChanges() {
        Product product = Product.builder()
                .name("Notebook Gamer Ágil")
                .brand("Algaworks")
                .description("Notebook")
                .regularPrice(new BigDecimal("100.00"))
                .salePrice(new BigDecimal("90.00"))
                .enabled(true)
                .category(new Category("Notebooks", true))
                .build();

        assertEquals("notebook-gamer-agil", product.getSlug());

        product.setName("Desktop Pro 2026");

        assertEquals("desktop-pro-2026", product.getSlug());
    }
}
