package com.example.demo.springbucks.entity;

/**
 * @author lizhenjiang
 */

public enum OrderState {
    // 初始化
    INIT
    // 已支付
    ,PAID
    // 制作中
    ,BREWING
    // 制作完成
    ,BREWED
    // 已取货
    ,TAKEN
    // 取消
    ,CANCELLED
}
