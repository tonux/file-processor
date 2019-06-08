package com.sn.dk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FileProcessApplication {

    public static void main(String[] args) {

        SpringApplication.run(FileProcessApplication.class, args);
    }

}
