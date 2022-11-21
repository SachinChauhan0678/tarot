package com.Tuespot.tarot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tuespot.tarot.entity.PaymentGateWay;
import com.Tuespot.tarot.service.PaymentGatwayService;



@RestController
@CrossOrigin
@RequestMapping("/paymentGatway")
public class PaymentGatwayController {
	
	@Autowired
	PaymentGatwayService gatwayService;
	
	@PostMapping("/")
	public PaymentGateWay addData(@RequestBody PaymentGateWay paymentGateWay) {
		return this.gatwayService.addData(paymentGateWay);
		
	}

	@GetMapping("/")
	public List<PaymentGateWay> getData(){
		return this.gatwayService.getData();
		
	}
}
