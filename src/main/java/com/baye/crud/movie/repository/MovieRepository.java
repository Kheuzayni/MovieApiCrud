package com.baye.crud.movie.repository;

import com.baye.crud.movie.modele.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Long> {
}
