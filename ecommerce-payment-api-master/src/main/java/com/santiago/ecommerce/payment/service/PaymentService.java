package com.santiago.ecommerce.payment.service;

import com.santiago.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.santiago.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
