package com.workintech.s18d2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Fruit", schema = "fsweb")
public class Fruit {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

}
