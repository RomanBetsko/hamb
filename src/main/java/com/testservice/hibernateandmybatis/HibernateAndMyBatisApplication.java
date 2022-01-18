package com.testservice.hibernateandmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class HibernateAndMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateAndMyBatisApplication.class, args);
    }


}
