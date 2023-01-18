package com.baye.crud.movie.service;

import com.baye.crud.movie.modele.Movie;
import com.baye.crud.movie.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor //creer des constructeurs avec tous les champs
public class MovieServiceImpl implements MovieService {
    //Injection par constructeur du DAO
    private final MovieRepository movieRepository;

    //Méthode
    @Override
    public Movie creer(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> lire() {
        return movieRepository.findAll();
    }

    @Override
    public Movie modifier(Long id, Movie movie) {
        return movieRepository.findById(id)
                .map(m->{
                    m.setTitle(movie.getTitle());
                    m.setDescription(movie.getDescription());
                    m.setYear(movie.getYear());
                    m.setCover(movie.getCover());
                    return movieRepository.save(m);
                }).orElseThrow(() -> new RuntimeException("movie non trouvé, xolatal boubax !!!"));
    }

    @Override
    public String supprimer(Long id) {
        movieRepository.deleteById(id);
        return "Movie supprimé avec succès";
    }
}
