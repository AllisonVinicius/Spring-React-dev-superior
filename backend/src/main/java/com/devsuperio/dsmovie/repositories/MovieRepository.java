package com.devsuperio.dsmovie.repositories;

import com.devsuperio.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  MovieRepository  extends JpaRepository<Movie, Long> {


}
