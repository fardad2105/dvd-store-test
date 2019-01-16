package com.mydvdstore.controller;


import com.mydvdstore.model.tables.pojos.Film;
import com.mydvdstore.service.Impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
