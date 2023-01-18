package com.baye.crud.movie.service;

import com.baye.crud.movie.modele.Movie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor //creer des constructeurs avec tous les champs
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie creer() {
        return null;
    }

    @Override
    public List<Movie> lire() {
        return null;
    }

    @Override
    public Movie modifier(Long id, Movie movie) {
        return null;
    }

    @Override
    public String supprimer(Long id) {
        return null;
    }
}
