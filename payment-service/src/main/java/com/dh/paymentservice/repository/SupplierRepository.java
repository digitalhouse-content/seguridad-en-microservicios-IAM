package com.dh.paymentservice.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.dh.paymentservice.model.SupplierDTO;


@Repository
public class SupplierRepository {
    private FeignSupplierRepository feignSubscriptionRepository;
    
    public SupplierRepository(FeignSupplierRepository feignSubscriptionRepository) {
        this.feignSubscriptionRepository = feignSubscriptionRepository;
    }

    public boolean isInBlackList(String supplierName){
        return feignSubscriptionRepository.isInBlackList(supplierName);
    }


}
