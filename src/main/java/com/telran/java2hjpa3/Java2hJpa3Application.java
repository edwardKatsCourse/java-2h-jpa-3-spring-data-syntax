package com.telran.java2hjpa3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java2hJpa3Application {

    public static void main(String[] args) {
        String value =
                "select new com.telran.java2hjpa.entity.dto.MovieDTO(m.id, m.movie) from Movie m where m.movie = :movieParam and m.directorName = :dn";
        SpringApplication.run(Java2hJpa3Application.class, args);
    }

}

