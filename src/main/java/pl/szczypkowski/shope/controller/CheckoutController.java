package pl.szczypkowski.shope.controller;


import org.springframework.web.bind.annotation.*;
import pl.szczypkowski.shope.dto.Purchase;
import pl.szczypkowski.shope.dto.PurchaseResponse;
import pl.szczypkowski.shope.service.CheckoutService;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase)
    {
        PurchaseResponse purchaseResponse=checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }

}
