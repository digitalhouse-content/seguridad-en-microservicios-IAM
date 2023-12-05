package com.dh.supplierdataservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.supplierdataservice.model.SupplierDTO;
import com.dh.supplierdataservice.service.SupplierService;

@RestController
@RequestMapping
public class SupplierRestController {
	@Autowired
	private SupplierService supplierService;

	
	@PreAuthorize("hasRole('ROLE_manage-account')")
	@GetMapping("/supplier/blacklist/{name}")
	public boolean isInBlackList(@PathVariable String name) {
		return supplierService.isInBlackList(name);
	}
}
