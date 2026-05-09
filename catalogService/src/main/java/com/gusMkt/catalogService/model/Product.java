package com.gusMkt.catalogService.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "produto")
@NoArgsConstructor
public class Product {

    @Id
    @Column(length = 13)
    private String  ean;

    @Column(length = 120)
    private String name;

    @PositiveOrZero()
    private Double price;

    private Boolean isOver18;

    @Column(length = 200)
    private String image;

}
