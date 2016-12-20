package com.github.myproject.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by xiedan on 2016/12/18.
 */
@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource dataSource(){
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/rest_demo?allowMultiQueries=true");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
}
