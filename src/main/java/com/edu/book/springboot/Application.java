package com.edu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        // 내장WAS실행(톰캣설치X)
        SpringApplication.run(Application.class, args);
    }
}

