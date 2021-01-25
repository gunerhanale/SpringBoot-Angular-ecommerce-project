package com.jeweler.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    // final tag provide to use this variable everywhere without creating constructor.
    private final String orderTrackingNumber;

}
