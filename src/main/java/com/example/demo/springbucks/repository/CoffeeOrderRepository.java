package com.example.demo.springbucks.repository;

import com.example.demo.springbucks.entity.CoffeeOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lizhenjiang
 */
public interface CoffeeOrderRepository extends CrudRepository<CoffeeOrder, Long> {
}
