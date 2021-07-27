package com.example.demo.springbucks.repository;

import com.example.demo.springbucks.entity.Coffee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.annotations.Parameter;

import java.util.List;

/**
 * @author lizhenjiang
 */
@Mapper
public interface CoffeeMapper {
    List<Coffee> findCoffeeByName(@Param("coffeeName") String coffeeName);

    Integer saveCoffee(@Param("coffees") List<Coffee> coffees);
}
