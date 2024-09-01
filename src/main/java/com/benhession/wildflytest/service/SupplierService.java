package com.benhession.wildflytest.service;

import com.benhession.wildflytest.model.Supplier;
import com.benhession.wildflytest.repository.SupplierRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class SupplierService {
    @Inject
    private SupplierRepository supplierRepository;

    public Optional<Supplier> findById(Long id) {
        return Optional.ofNullable(supplierRepository.findBy(id));
    }

    public Supplier addSupplier(String name) {
        var supplier = Supplier.builder()
                .name(name)
                .build();

        return supplierRepository.save(supplier);
    }

    public Supplier deleteSupplier(Long id) {
        var supplier = findById(id).orElseThrow();
        supplierRepository.remove(supplier);
        return supplier;
    }

    public List<Supplier> getAllSuppliers() {
        return new ArrayList<>(supplierRepository.findAll());
    }
}
