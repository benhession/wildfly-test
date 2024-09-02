package com.benhession.wildflytest.message;

import org.apache.deltaspike.core.api.message.MessageBundle;
import org.apache.deltaspike.core.api.message.MessageTemplate;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@MessageBundle
public interface CommonMessage {
    @MessageTemplate("{homeTitle}")
    String homeTitle();
    @MessageTemplate("{homeH1}")
    String homeH1();
    @MessageTemplate("{homeTestBody}")
    String homeTestBody();
    @MessageTemplate("addSupplierH1")
    String addSupplierH1();
    @MessageTemplate("missingSuppliersMessage")
    String missingSuppliersMessage();
    @MessageTemplate("{supplierName}")
    String supplierName();
    @MessageTemplate("{add}")
    String add();
    @MessageTemplate("{newSupplierName}")
    String newSupplierName();
    @MessageTemplate("{back}")
    String back();
}
