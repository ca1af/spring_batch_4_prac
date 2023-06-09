package com.example.spring_batch_4;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatch4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatch4Application.class, args);
    }

}
