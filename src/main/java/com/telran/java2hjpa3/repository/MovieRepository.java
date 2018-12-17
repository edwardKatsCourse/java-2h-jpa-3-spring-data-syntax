package com.telran.java2hjpa3.repository;

import com.telran.java2hjpa3.entity.Movie;
import com.telran.java2hjpa3.entity.dto.MovieDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    //JPQL - Java Persistence Query Language
    //Criteria API

    //---------------------------------------------------------


    Movie findByMovie(String movieName);
    List<Movie> findAllByMovieLike(String movieName);

    Movie findByDirectorName(String directorName);

    @Query(value = "select new com.telran.java2hjpa3.entity.dto.MovieDTO(m.id, m.movie) from Movie m where m.movie = :movieParam and m.directorName = :dn")
    MovieDTO getMyCustomMovie(@Param("dn") String sdfsdf, @Param("movieParam") String sdgsdg);

}
