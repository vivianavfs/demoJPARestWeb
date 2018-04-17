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
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Art> topArts() {
        return repository.findAll().stream()
                .filter(this::top)
                .collect(Collectors.toList());
    }

    public boolean top(Art art) {
        return art.getName().equals("Monalisa");
    }
}
