package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Vegetable;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vegetables")
public class VegetableController {


    @GetMapping
    public List<Vegetable> getAllVegetables() {
        return null;
    }

    @GetMapping("/{id}")
    public Vegetable getVegetable(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/desc")
    public List<Vegetable> getVegetablesDesc() {
        return null;
    }

    @GetMapping("/{name}")
    public Vegetable getByName(@PathVariable String name) {
        return null;
    }

    @PostMapping
    public Vegetable save(@RequestBody Vegetable vegetable) {
        //
        return vegetable;
    }

    @DeleteMapping("/{id}")
    public Vegetable delete(@PathVariable Long id) {
        return null;
    }




}
