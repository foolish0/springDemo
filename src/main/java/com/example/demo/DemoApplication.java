package com.example.demo;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author lizhenjiang
 */
//@EnableHasor()
//@EnableHasorWeb()
@SpringBootApplication
@RestController
//@Slf4j
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello String!";
    }

    @Override
    public void run(String... args) throws Exception {
        String sql = "select * from t_b left join t_a on t_a.id = t_b.id";
        showConnection();
        showData(sql);
    }

    private void showConnection() throws SQLException {
        System.out.println(dataSource.toString());
        Connection con = dataSource.getConnection();
        System.out.println(con.toString());
        con.close();
    }

    private void showData(String sql) {
        jdbcTemplate.queryForList(sql).forEach(row -> System.out.println(row.toString()));
    }

}
