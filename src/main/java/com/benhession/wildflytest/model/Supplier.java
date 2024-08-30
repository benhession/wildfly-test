package com.benhession.wildflytest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue
    long id;
    String name;
}
