package com.example.demo.democode.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
* 对象转json的工具类
 */
public class JsonUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();
    private static String result="";

    public static String objectToJson(Object object) {
        try {
            objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
