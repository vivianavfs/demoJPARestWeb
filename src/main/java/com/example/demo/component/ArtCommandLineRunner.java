package com.example.demo.component;

import com.example.demo.model.Art;
import com.example.demo.repository.ArtRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ArtCommandLineRunner implements CommandLineRunner {

    private final ArtRepository repository;

    public ArtCommandLineRunner(ArtRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        repository.save(new Art("Mona Lisa","Leonardo da Vinci","assets/imgs/painting/monalisa.jpg", 1));
        repository.save(new Art("Moça com o Brinco de Pérola","Johannes Vermeer","assets/imgs/painting/brinco-perola.jpg", 2));
        repository.save(new Art("A Noite Estrelada","Vincent van Gogh","assets/imgs/painting/noite-estrelada.jpg",3));
        repository.save(new Art("O baile no moulin de la Galette","Pierre-Auguste Renoir","assets/imgs/painting/baile-moulin.jpg",4));
        repository.save(new Art("A Ronda Noturna","Rembrandt","assets/imgs/painting/ronda-noturna.jpg",5));
        repository.save(new Art("A Última Ceia","Leonardo da Vinci","assets/imgs/painting/ultima-ceia.jpg",6));
        repository.save(new Art("Arranjo em Cinza e Preto nº1","James McNeill Whistler","https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Whistlers_Mother_high_res.jpg/220px-Whistlers_Mother_high_res.jpg",7));

        repository.findAll().forEach(System.out::println);

    }
}
