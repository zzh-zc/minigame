package com.f4.minigame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.f4.minigame.mapper")
@SpringBootApplication
public class MinigameApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinigameApplication.class, args);
    }

}
