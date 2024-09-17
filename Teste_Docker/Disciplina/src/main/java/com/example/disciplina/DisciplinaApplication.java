package com.example.disciplina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DisciplinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisciplinaApplication.class, args);
    }

}
