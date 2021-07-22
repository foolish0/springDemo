package com.example.demo.test;

import com.fundebug.Fundebug;
import lombok.Data;
import lombok.SneakyThrows;
import org.assertj.core.util.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        Fundebug fundebug = new Fundebug("95f9770350f7b78621087fd16c587269d017b3f8f50e4ff5681a311c13d0e917");
//        fundebug.notify("Test", "Hello Fundebug!");

        Stream<KeyValuePair<String, Integer>> stream = Stream.of(
                new KeyValuePair<>("Harry", 2002),
                new KeyValuePair<>("Bob", 2014),
                new KeyValuePair<>("Harry", 2033)
        ).parallel();

        Map<String, List<Integer>> map = stream.collect(
                Collectors.groupingBy(
                KeyValuePair::getKey, Collectors.mapping(KeyValuePair::getValue, Collectors.toList()))
        );
        Map<String, List<Integer>> collect = stream.collect(
                Collectors.groupingBy(
                        KeyValuePair::getKey, Collectors.mapping(KeyValuePair::getValue, Collectors.toList()))
        );
    }
}
