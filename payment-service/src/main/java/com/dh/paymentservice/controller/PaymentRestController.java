package com.dh.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {

    private PaymentService paymentService;

    public PaymentRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @GetMapping("/pay/{supplier}/{amount}")
    public String paySupplier(@PathVariable String supplier, @PathVariable int amount){
        return paymentService.paySupplier(supplier,amount);
    }
}
