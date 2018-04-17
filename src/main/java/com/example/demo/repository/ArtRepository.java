package com.example.demo.repository;

import com.example.demo.model.Art;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArtRepository extends JpaRepository<Art, Long> {
}
