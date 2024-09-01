package com.benhession.wildflytest.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "suppliers")
@NoArgsConstructor
public class Supplier {

    @Builder
    public Supplier(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    long id;
    String name;
}
