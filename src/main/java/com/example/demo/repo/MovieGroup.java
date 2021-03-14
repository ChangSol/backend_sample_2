package com.example.demo.repo;

import com.example.demo.domain.Movie;

import java.util.List;
import java.util.stream.Collectors;

//네이버 영화 검색 후 평점순 정렬을 위한 클래스
public class MovieGroup {
    private final List<Movie> movieList;

    public MovieGroup(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public List<Movie> getMovieListOrderRating(){
        return movieList.stream()
                .filter(p -> p.getUserRating() != 0.0f)
                .sorted((a,b) -> b.getUserRating() > a.getUserRating() ? 1:-1)
                .collect(Collectors.toList());
    }
}
