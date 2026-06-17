package com.example.payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PaymentController{
 @GetMapping("/")
 public String home(){ return "Payment Service Running"; }

 @GetMapping("/health")
 public String health(){ return "UP"; }
}
