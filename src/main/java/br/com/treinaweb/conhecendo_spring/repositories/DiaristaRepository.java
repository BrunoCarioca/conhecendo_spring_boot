package br.com.treinaweb.conhecendo_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.conhecendo_spring.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long> {
    
}
