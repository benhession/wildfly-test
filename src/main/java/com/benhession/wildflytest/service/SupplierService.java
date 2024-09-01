package com.benhession.wildflytest.service;

import com.benhession.wildflytest.model.Supplier;
import com.benhession.wildflytest.repository.SupplierRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Optional;

@ApplicationScoped
public class SupplierService {
    @Inject
    private SupplierRepository supplierRepository;

    Optional<Supplier> findById(Long id) {
        return Optional.ofNullable(supplierRepository.findBy(id));
    }

    Supplier addSupplier(String name) {
        var supplier = Supplier.builder()
                .name(name)
                .build();

        return supplierRepository.save(supplier);
    }

    Supplier deleteSupplier(Long id) {
        var supplier = findById(id).orElseThrow();
        supplierRepository.remove(supplier);
        return supplier;
    }
}
