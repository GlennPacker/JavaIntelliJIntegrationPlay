package com.example.springfun.repositories;

import com.example.springfun.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
