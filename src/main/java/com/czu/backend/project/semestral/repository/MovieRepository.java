package com.czu.backend.project.semestral.repository;

import com.czu.backend.project.semestral.model.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();

}
