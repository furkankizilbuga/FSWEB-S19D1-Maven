package com.workintech.s18d2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Vegetable", schema = "fsweb")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @Column(name="grown_on_tree")
    private boolean isGrownOnTree ;

}
