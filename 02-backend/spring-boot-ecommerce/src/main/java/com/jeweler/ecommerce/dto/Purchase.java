package com.jeweler.ecommerce.dto;


import com.jeweler.ecommerce.entity.Address;
import com.jeweler.ecommerce.entity.Customer;
import com.jeweler.ecommerce.entity.Order;
import com.jeweler.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
