package com.baye.crud.movie.service;

import com.baye.crud.movie.modele.Movie;

import java.util.List;

public interface MovieService {
    Movie creer();

    List<Movie> lire();

    Movie modifier (Long id, Movie movie);

    String supprimer (Long id);

}
