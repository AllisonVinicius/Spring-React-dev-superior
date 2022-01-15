package com.devsuperio.dsmovie.repositories;

import com.devsuperio.dsmovie.entities.*;
import org.springframework.data.jpa.repository.*;

public interface  MovieRepository  extends JpaRepository<Movie, Long> {


}
