package com.sreepreetham.product_service.dto;

import com.sreepreetham.product_service.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRegister {
  private UUID id;
  private String name;
  private String description;
  private BigDecimal price;
  private float rating;

  public ProductRegister(Product product) {
    this.id = product.getId();
    this.name = product.getName();
    this.description = product.getDescription();
    this.price = product.getPrice();
    this.rating = product.getRating();
  }
}
