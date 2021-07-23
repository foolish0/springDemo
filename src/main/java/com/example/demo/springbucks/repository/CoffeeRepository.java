package com.example.demo.springbucks.repository;

import com.example.demo.springbucks.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lizhenjiang
 */
public interface CoffeeRepository extends CrudRepository<Coffee, Long> {
}
