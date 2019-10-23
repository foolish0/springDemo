package com.example.demo;

//import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        //关闭banner
        //app.setBannerMode(Banner.Mode.OFF);
        //不允许命令行修改项目配置
        app.setAddCommandLineProperties(false);
        app.run(args);
        //SpringApplication.run(DemoApplication.class, args);
    }

}
