package com.benhession.wildflytest.repository;

import com.benhession.wildflytest.model.Supplier;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface SupplierRepository extends EntityRepository<Supplier, Long> {
}
