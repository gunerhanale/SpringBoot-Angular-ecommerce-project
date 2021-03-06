package com.jeweler.ecommerce.controller;

import com.jeweler.ecommerce.dto.Purchase;
import com.jeweler.ecommerce.dto.PurchaseResponse;
import com.jeweler.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin("http://localhost:4200")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}


