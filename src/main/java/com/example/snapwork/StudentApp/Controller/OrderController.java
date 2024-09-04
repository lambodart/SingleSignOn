package com.example.snapwork.StudentApp.Controller;
import java.time.Instant;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.snapwork.StudentApp.Bean.Order;
import com.example.snapwork.StudentApp.Service.OrderProcessingService;

@RestController
public class OrderController {

    @Autowired
    private OrderProcessingService orderProcessingService;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestParam("orderDetails") String orderDetails,  
                             @RequestParam("customerEmail") String customerEmail) {

        // Process the order synchronously
    	Instant startTime = null;
	    Instant endTime = null;
	    startTime = Instant.now();
	    System.out.println("Start Time :: "+startTime + " :: " + LocalTime.now());
	    
        Order order = orderProcessingService.processOrder(orderDetails, customerEmail);
        endTime = Instant.now();
        System.out.println("end Time :: "+endTime+ " :: " + LocalTime.now() );
        
        // Perform other tasks independently
        System.out.println("sendOrderConfirmationEmail start:: "+Instant.now()+ " :: " + LocalTime.now());
        orderProcessingService.sendOrderConfirmationEmail(order);
        System.out.println("sendOrderConfirmationEmail end:: "+Instant.now()+ " :: " + LocalTime.now());
        
        System.out.println("generateInvoice start:: "+Instant.now()+ " :: " + LocalTime.now());
        orderProcessingService.generateInvoice(order);
        System.out.println("generateInvoice End:: "+Instant.now()+ " :: " + LocalTime.now());

        return "Order placed successfully. Order ID: " + order.getId();
    }
}
