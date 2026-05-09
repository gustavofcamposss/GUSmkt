package com.gusMkt.catalogService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "funcionario")
@NoArgsConstructor
public class Employee {

    @Id
    @Column(length = 13)
    private String registration;

    @Column(length = 120)
    private String name;

}
