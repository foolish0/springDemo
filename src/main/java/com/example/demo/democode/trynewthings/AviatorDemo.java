package com.example.demo.democode.trynewthings;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.AviatorEvaluatorInstance;
import com.googlecode.aviator.BaseExpression;
import com.googlecode.aviator.Expression;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * @author lizhenjiang
 */
public class AviatorDemo {
    AviatorEvaluatorInstance instance = AviatorEvaluator.getInstance();
    @Test
    public void aviator() {
        String expression = "println('Hello Aviator');";
        Expression script = instance.compile("HelloWorld", expression, true);
        script.execute();

        String cal = "(a+b)/c";
        List<Num> nums = Lists.newArrayList();
        for (int i = 1; i <= 10; i++) {
            nums.add(new Num(i*100.0, i*200.0, i*2.0));
        }
        Expression calScript = instance.compile(cal);
        HashMap<String, Object> env = new HashMap<>(10, 0.75f);
        env.put("a", 100);
        env.put("b", 200);
        env.put("c", 2);
        for (int i = 0; i < 10; i++) {
            calScript.execute(env);
        }
        Object execute = calScript.execute(env);
        System.out.println(execute.toString());
    }
}

class Num {
    private Double a;
    private Double b;
    private Double c;

    public Num(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}
