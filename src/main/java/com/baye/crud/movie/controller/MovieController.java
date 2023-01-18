package com.baye.crud.movie.controller;

import com.baye.crud.movie.modele.Movie;
import com.baye.crud.movie.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@AllArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @PostMapping("/create")
    public Movie create(@RequestBody Movie movie){
        return movieService.creer(movie);
    }

    @GetMapping("/read")
    public List<Movie> read(){
        return movieService.lire();
    }

    @PutMapping("/update/{id}")
    public Movie update(@PathVariable Long id,@RequestBody Movie movie){
        return movieService.modifier(id, movie);
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return movieService.supprimer(id);
    }
}
