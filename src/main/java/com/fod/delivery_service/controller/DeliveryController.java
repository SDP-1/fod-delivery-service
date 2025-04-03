package com.fod.delivery_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
@Validated
public class DeliveryController {

    @GetMapping
    public ResponseEntity<String> testDelivery() {
        return ResponseEntity.ok("Delivary service work...");
    }

}
