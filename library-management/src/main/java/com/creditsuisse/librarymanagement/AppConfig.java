package com.creditsuisse.librarymanagement;

import com.creditsuisse.librarymanagement.repository.BookRepository;
import com.creditsuisse.librarymanagement.repository.UsersRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {
    @Bean
    public BookRepository booksRepo(){
        return new BookRepository();
    }
    
    @Bean
    public UsersRepository usersRepo(){
        return new UsersRepository();
    }
}

