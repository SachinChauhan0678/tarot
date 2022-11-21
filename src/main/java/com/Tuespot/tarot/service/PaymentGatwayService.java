package com.Tuespot.tarot.service;

import java.util.List;

import com.Tuespot.tarot.entity.PaymentGateWay;



public interface PaymentGatwayService {

	public PaymentGateWay addData(PaymentGateWay gateWay);
	
	public List<PaymentGateWay> getData();
}
