package com.santiago.ecommerce.checkout.service;

import com.santiago.ecommerce.checkout.entity.CheckoutEntity;
import com.santiago.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
