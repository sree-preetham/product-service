package com.sreepreetham.product_service.form;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRegistrationForm {

  @NotBlank private String name;
  @NotBlank private String description;
  @NotBlank private BigDecimal price;
  private float rating = 0;
}
