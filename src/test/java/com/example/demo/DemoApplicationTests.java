package com.example.demo;

import com.example.demo.democode.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        KieSession statefulKieSession = container.newKieSession("myAgeSession");

        Student student = new Student("RoyLi", 24);
        statefulKieSession.insert(student);
        statefulKieSession.fireAllRules();
        statefulKieSession.dispose();
    }

}
