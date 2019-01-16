package com.mydvdstore.service.Impl;

import com.mydvdstore.model.tables.daos.FilmDao;
import com.mydvdstore.model.tables.pojos.Film;
import com.mydvdstore.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {


    FilmDao filmDao = new FilmDao();

    @Override
    public List<Film> getMovieList() {
        return filmDao.findAll();
    }

    @Override
    public Film getMovieById(int id) {
        return filmDao.fetchOneByFilmId(id);
    }
}
