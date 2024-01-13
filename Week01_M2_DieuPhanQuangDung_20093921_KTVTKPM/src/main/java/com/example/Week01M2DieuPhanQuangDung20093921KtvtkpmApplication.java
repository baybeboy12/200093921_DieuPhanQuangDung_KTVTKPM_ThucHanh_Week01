package com.example;

import com.example.models.Product;
import com.example.models.Users;
import com.example.repositories.ProductRepository;
import com.example.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week01M2DieuPhanQuangDung20093921KtvtkpmApplication {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Week01M2DieuPhanQuangDung20093921KtvtkpmApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            for (int i = 0; i < 10; i++) {
                usersRepository.save(new Users("user "+i,"123"));
                productRepository.save(new Product("product "+i,123));
            }
        };
    }

}
