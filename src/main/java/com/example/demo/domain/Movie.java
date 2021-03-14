package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Movie {

    private String title;
    private String link;
    private float userRating;
}
