package com.example.pb_aluno_microsser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class PbAlunoMicrosserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbAlunoMicrosserApplication.class, args);
    }

}
