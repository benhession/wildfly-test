package com.benhession.wildflytest.controller;

import com.benhession.wildflytest.model.Supplier;
import com.benhession.wildflytest.service.SupplierService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Named
@RequestScoped
public class SupplierController {

    @Inject
    private SupplierService supplierService;
    @Getter
    private List<Supplier> suppliers;
    @Setter
    @Getter
    private String name;

    @PostConstruct
    public void loadSuppliers() {
        suppliers = supplierService.getAllSuppliers();
    }

    public void addSupplier() {
        if (name != null) {
            supplierService.addSupplier(name);
        }
    }
}
