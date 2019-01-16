package com.mydvdstore.service;

import com.mydvdstore.model.tables.pojos.Film;

import java.util.List;

public interface MovieService {


    List<Film> getMovieList();

    Film getMovieById(int id);
    
}
