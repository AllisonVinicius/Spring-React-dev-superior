package com.devsuperio.dsmovie.controller;

import com.devsuperio.dsmovie.dto.*;
import com.devsuperio.dsmovie.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping
    public Page<MovieDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @GetMapping(value = "/{id}")
    public MovieDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

}
