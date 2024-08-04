package com.exe201.ilink_model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ILinkModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ILinkModelApplication.class, args);
    }

}
