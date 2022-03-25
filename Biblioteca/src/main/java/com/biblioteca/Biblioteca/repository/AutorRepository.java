package com.biblioteca.Biblioteca.repository;

import com.biblioteca.Biblioteca.model.Autor;
import com.biblioteca.Biblioteca.model.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findAutorByName(@Param("name") String autor);
}
