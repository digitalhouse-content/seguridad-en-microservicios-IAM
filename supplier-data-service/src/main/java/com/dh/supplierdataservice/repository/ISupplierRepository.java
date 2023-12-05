package com.dh.supplierdataservice.repository;

import java.util.List;
import java.util.Optional;

import com.dh.supplierdataservice.model.SupplierDTO;

public interface ISupplierRepository {

  Optional<SupplierDTO> findById(String id);

  List<SupplierDTO> findByUsername(String username);
}
