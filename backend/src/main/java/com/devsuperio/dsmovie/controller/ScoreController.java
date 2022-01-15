package com.devsuperio.dsmovie.controller;


import com.devsuperio.dsmovie.dto.*;
import com.devsuperio.dsmovie.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }


}
