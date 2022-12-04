package org.sid.orderservice.entities;

import org.sid.orderservice.enums.OrderStatus;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullOrders", types = Order.class)
public interface OrderProjection {
     Long getId();
     String getOrderDate();
     Long getCustomerId();
     OrderStatus getOrderStatus();


}


