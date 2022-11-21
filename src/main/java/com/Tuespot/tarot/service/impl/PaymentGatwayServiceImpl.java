package com.Tuespot.tarot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.Tuespot.tarot.entity.PaymentGateWay;
import com.Tuespot.tarot.repo.PaymentGatwayRepo;
import com.Tuespot.tarot.service.PaymentGatwayService;

@Service
public class PaymentGatwayServiceImpl implements PaymentGatwayService{

	@Autowired
	PaymentGatwayRepo gatwayRepo;
	@Override
	public PaymentGateWay addData(PaymentGateWay gateWay) {
		// TODO Auto-generated method stub
		return this.gatwayRepo.save(gateWay);
	}

	@Override
	public List<PaymentGateWay> getData() {
		// TODO Auto-generated method stub
		return this.gatwayRepo.findAll();
	}

}
