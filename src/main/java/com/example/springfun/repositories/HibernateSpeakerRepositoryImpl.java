package com.example.springfun.repositories;

import com.example.springfun.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        speakers.add(new Speaker("John","Smith"));

        return speakers;
    }
}
