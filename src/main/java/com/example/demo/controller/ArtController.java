package com.example.demo.controller;

import com.example.demo.model.Art;
import com.example.demo.repository.ArtRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class ArtController {
    private ArtRepository repository;

    public ArtController(ArtRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/top-arts")
	@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
    public Collection<Art> topArts() {
        return repository.findTop10ByOrderByRankingAsc();
    }

}
