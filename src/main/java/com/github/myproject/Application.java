package com.github.myproject;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xiedan11 on 2016/12/15.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(Application.class);
        application.setAddCommandLineProperties(false);     //禁用命令行参数
        application.run(args);

    }
}
