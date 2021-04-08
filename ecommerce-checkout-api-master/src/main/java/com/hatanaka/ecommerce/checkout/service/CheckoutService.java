package com.hatanaka.ecommerce.checkout.service;

import java.util.Optional;

public interface CheckoutService{
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest)
}