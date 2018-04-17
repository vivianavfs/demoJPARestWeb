package com.example.demo.component;

import com.example.demo.model.Art;
import com.example.demo.repository.ArtRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ArtCommandLineRunner implements CommandLineRunner {

    private final ArtRepository repository;

    public ArtCommandLineRunner(ArtRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Art("Mona Lisa","Leonardo da Vinci","monalisa.jpg"));
        repository.save(new Art("Moça com o Brinco de Pérola","Johannes Vermeer","brinco-perola.jpg"));
        repository.save(new Art("A Noite Estrelada","Vincent van Gogh","noite-estrelada.jpg"));

        repository.findAll().forEach(System.out::println);

    }
}
