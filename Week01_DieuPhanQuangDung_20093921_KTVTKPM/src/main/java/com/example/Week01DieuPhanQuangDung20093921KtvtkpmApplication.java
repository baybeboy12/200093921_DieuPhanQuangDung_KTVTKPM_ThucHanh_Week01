package com.example;

import com.example.models.Users;
import com.example.repositorries.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week01DieuPhanQuangDung20093921KtvtkpmApplication {
    @Autowired
    private UsersRepository usersRepository;
    public static void main(String[] args) {
        SpringApplication.run(Week01DieuPhanQuangDung20093921KtvtkpmApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            for (int i = 0;i<=10;i++){
                usersRepository.save(new Users("user "+i,"123"));
            }
        };
    }

}
