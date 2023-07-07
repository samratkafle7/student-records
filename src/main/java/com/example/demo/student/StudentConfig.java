package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
                    Student jason = new Student(
                            "Jason",
                            LocalDate.of(1992, 04, 29),
                            "samratkafle7@gmail.com"

            );
                    repository.saveAll(
                            List.of(jason)
                    );

        };
    }
}
