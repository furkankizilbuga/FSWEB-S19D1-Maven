package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    @Query(value = "SELECT v FROM fsweb.vegetable v ORDER BY v.price", nativeQuery = true)
    List<Vegetable> orderByPriceAsc();

    @Query(value = "SELECT v FROM fsweb.vegetable v ORDER BY v.price DESC", nativeQuery = true)
    List<Vegetable> orderByPriceDesc();

    @Query(value = "SELECT v FROM fsweb.vegetable v WHERE v.name ILIKE %:name%", nativeQuery = true)
    List<Vegetable> getByName(String name);

}
