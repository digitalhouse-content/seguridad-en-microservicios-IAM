package com.dh.paymentservice.service;

import org.springframework.stereotype.Service;

import com.dh.paymentservice.repository.SupplierRepository;

@Service
public class PaymentService {
    private SupplierRepository proveedorRepository;

    public PaymentService(SupplierRepository subscriptionRepository) {
        this.proveedorRepository = subscriptionRepository;
    }

    public String paySupplier(String supplierName, Integer monto){
               
        
    	String response = "payment processed";
    	
    	if(proveedorRepository.isInBlackList(supplierName)) {
    		response = "payment error due to blocked supplier";
    	}

        return response;
    }
}
