package pl.szczypkowski.shope.dto;

import lombok.Data;
import pl.szczypkowski.shope.entity.Address;
import pl.szczypkowski.shope.entity.Customer;
import pl.szczypkowski.shope.entity.Order;
import pl.szczypkowski.shope.entity.OrderItem;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    //private Address shippingAddress;
    private Address customerAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
