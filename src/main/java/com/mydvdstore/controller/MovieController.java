package com.mydvdstore.controller;


import com.mydvdstore.model.tables.pojos.Film;
import com.mydvdstore.service.Impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    @GetMapping("/movies")
    public String movieList(Model model)
    {
        List<Film> films = movieService.getMovieList();
        model.addAttribute("movies",films);
        return "Movies";

    }

    @GetMapping("movie/{filmId}")
    public String movieById(@PathVariable int filmId,Model model) throws IOException
    {
        Film film = movieService.getMovieById(filmId);
        model.addAttribute("movie",film);

        return "viewMovie";
    }
}
