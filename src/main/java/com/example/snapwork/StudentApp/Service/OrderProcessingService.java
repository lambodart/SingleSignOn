package com.example.snapwork.StudentApp.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.snapwork.StudentApp.Bean.Invoice;
import com.example.snapwork.StudentApp.Bean.Order;
import com.example.snapwork.StudentApp.Repository.InvoiceRepository;
import com.example.snapwork.StudentApp.Repository.OrderRepository;

@Service
public class OrderProcessingService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Transactional
    public Order processOrder(String orderDetails, String customerEmail) {
        // Save the order to the database
        Order order = new Order();
        order.setOrderDetails(orderDetails);
        order.setStatus("COMPLETED"); // Simulate order processing completion
        order.setCustomerEmail(customerEmail);

        order = orderRepository.save(order);

        return order;
    }

    @Async
    public void sendOrderConfirmationEmail(Order order) {
        // Simulate sending an email (e.g., using an email service)
        System.out.println("Sending order confirmation email to: " + order.getCustomerEmail() + " for Order ID: " + order.getId());
        // Actual email sending logic goes here
    }

    @Async 
    public void generateInvoice(Order order) {
        // Simulate generating an invoice
        Invoice invoice = new Invoice();
        invoice.setOrderId(order.getId());
        invoice.setInvoiceDetails("Invoice for Order ID: " + order.getId());

        invoiceRepository.save(invoice);
        System.out.println("Invoice generated and saved for Order ID: " + order.getId());
    }
}

