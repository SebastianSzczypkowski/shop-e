package pl.szczypkowski.shope.service;

import pl.szczypkowski.shope.dto.Purchase;
import pl.szczypkowski.shope.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
