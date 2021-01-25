package com.jeweler.ecommerce.service;

import com.jeweler.ecommerce.dto.Purchase;
import com.jeweler.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
