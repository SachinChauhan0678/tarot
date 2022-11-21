package com.Tuespot.tarot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tuespot.tarot.entity.PaymentGateWay;

@Repository
public interface PaymentGatwayRepo extends JpaRepository<PaymentGateWay, Integer> {

}
