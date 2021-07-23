package com.example.demo;

import com.example.demo.springbucks.entity.Coffee;
import com.example.demo.springbucks.entity.CoffeeOrder;
import com.example.demo.springbucks.entity.OrderState;
import com.example.demo.springbucks.repository.CoffeeOrderRepository;
import com.example.demo.springbucks.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;


/**
 * @author lizhenjiang
 */
//@EnableHasor()
//@EnableHasorWeb()
@SpringBootApplication
@RestController
@Slf4j
public class DemoApplication implements ApplicationRunner {
    @Autowired
    private CoffeeRepository coffeeRepository;
    @Autowired
    private CoffeeOrderRepository coffeeOrderRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        initOrders();
    }

    private void initOrders() {
        Coffee espresso = Coffee.builder()
                .name("espresso")
                .price(Money.of(CurrencyUnit.of("CNY"), 20.0))
                .build();
        coffeeRepository.save(espresso);
        log.info("coffee: {}", espresso);
        Coffee latte = Coffee.builder()
                .name("latte")
                .price(Money.of(CurrencyUnit.of("CNY"), 25.0))
                .build();
        coffeeRepository.save(latte);
        log.info("coffee: {}", latte);

        CoffeeOrder gabriel = CoffeeOrder.builder()
                .customer("Gabriel")
                .items(Arrays.asList(espresso, latte))
                .state(OrderState.INIT)
                .build();
        coffeeOrderRepository.save(gabriel);
        log.info("order: {}", gabriel);
        CoffeeOrder ming = CoffeeOrder.builder()
                .customer("XiaoMing")
                .items(Collections.singletonList(latte))
                .state(OrderState.INIT)
                .build();
        coffeeOrderRepository.save(ming);
        log.info("order: {}", ming);
    }
}
