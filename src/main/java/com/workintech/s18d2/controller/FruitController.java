package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/fruit")
public class FruitController {

    private FruitService fruitService;

    @GetMapping
    public List<Fruit> getAllFruits() {
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public Fruit getFruit(@Positive(message = "Id cannot be below zero!") @PathVariable Long id) {
        return fruitService.getById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getFruitsDesc() {
        return fruitService.getByPriceDesc();
    }

    @GetMapping("/name/{name}")
    public List<Fruit> getByName(@PathVariable String name) {
        return fruitService.searchByName(name);
    }

    @PostMapping
    public Fruit save(@Validated @RequestBody Fruit fruit) {
        return fruitService.save(fruit);
    }

    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable @Positive(message = "Id cannot be below zero!") Long id) {
        return fruitService.delete(id);
    }
}
