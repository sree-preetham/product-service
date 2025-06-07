package com.sreepreetham.product_service.service;

import com.sreepreetham.product_service.dto.ProductRegister;
import com.sreepreetham.product_service.entity.Product;
import com.sreepreetham.product_service.form.ProductRegistrationForm;
import com.sreepreetham.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
  private final ProductRepository productRepository;

  public ProductRegister registerProduct(ProductRegistrationForm form) {
    Product product =
        Product.builder()
            .name(form.getName())
            .description(form.getDescription())
            .id(UUID.randomUUID())
            .price(form.getPrice())
            .rating(form.getRating())
            .build();
    productRepository.save(product);
    log.info("Product {} is saved", product.getId());
    return new ProductRegister(product);
  }
}
