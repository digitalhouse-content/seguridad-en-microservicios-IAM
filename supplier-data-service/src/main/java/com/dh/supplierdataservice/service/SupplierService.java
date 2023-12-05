package com.dh.supplierdataservice.service;

import org.springframework.stereotype.Service;

import com.dh.supplierdataservice.model.SupplierDTO;
import com.dh.supplierdataservice.repository.ISupplierRepository;

@Service
public class SupplierService {
	private ISupplierRepository proveedorRepository;

	public SupplierService(ISupplierRepository userRepository) {
		this.proveedorRepository = userRepository;
	}

	public SupplierDTO findById(String id) {
		return proveedorRepository.findById(id).orElse(null);
	}

	public boolean isInBlackList(String name) {
		return !proveedorRepository.findByUsername(name).isEmpty();
	}
}
