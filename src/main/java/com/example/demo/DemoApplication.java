package com.example.demo;

import com.example.demo.springbucks.entity.Coffee;
import com.example.demo.springbucks.entity.CoffeeOrder;
import com.example.demo.springbucks.entity.OrderState;
import com.example.demo.springbucks.repository.CoffeeMapper;
import com.example.demo.springbucks.repository.CoffeeOrderRepository;
import com.example.demo.springbucks.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * @author lizhenjiang
 */
//@EnableHasor()
//@EnableHasorWeb()
@SpringBootApplication
@Slf4j
public class DemoApplication implements ApplicationRunner {
    //    @Autowired
//    private CoffeeRepository coffeeRepository;
//    @Autowired
//    private CoffeeOrderRepository coffeeOrderRepository;
    @Autowired
    private CoffeeMapper coffeeMapper;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        initOrders();
        coffeeByMybatis();
    }

    private void coffeeByMybatis() {
        List<Coffee> coffees = Lists.newArrayList();
        Coffee espresso = initCoffee("espresso", 20.0);
        coffees.add(espresso);
        Coffee latte = initCoffee("latte", 20.0);
        coffees.add(latte);
        Integer number = coffeeMapper.saveCoffee(coffees);
        log.info("Save Coffee with Mybatis: succeed: {}, failed: {}", number, coffees.size() - number);

        List<Coffee> coffeeInfo = coffeeMapper.findCoffeeByName("latte");
        log.info("Query Coffee with Mybatis: {}", coffeeInfo);
    }

    private void initOrders() {
        Coffee espresso = initCoffee("espresso", 20.0);
//        coffeeRepository.save(espresso);
        log.info("coffee: {}", espresso);
        Coffee latte = initCoffee("latte", 25.0);
//        coffeeRepository.save(latte);
        log.info("coffee: {}", latte);

        CoffeeOrder gabriel = initCoffeeOrder("Gabriel", Arrays.asList(espresso, latte));
//        coffeeOrderRepository.save(gabriel);
        log.info("order: {}", gabriel);
        CoffeeOrder ming = initCoffeeOrder("XiaoMing", Collections.singletonList(latte));
//        coffeeOrderRepository.save(ming);
        log.info("order: {}", ming);
    }

    private CoffeeOrder initCoffeeOrder(String gabriel2, List<Coffee> coffeeList) {
        return CoffeeOrder.builder()
                .customer(gabriel2)
                .items(coffeeList)
                .state(OrderState.INIT)
                .build();
    }

    private Coffee initCoffee(String name, double price) {
        return Coffee.builder()
                .name(name)
                .price(Money.of(CurrencyUnit.of("CNY"), price))
                .build();
    }
}
