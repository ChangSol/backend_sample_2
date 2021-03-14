package com.example.demo.repo;

import com.example.demo.domain.Movie;

import java.util.List;

public interface MovieRepository {

    List<Movie> findByQuery(String query);
}
