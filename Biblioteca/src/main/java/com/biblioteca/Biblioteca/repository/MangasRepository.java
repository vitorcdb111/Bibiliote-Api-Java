package com.biblioteca.Biblioteca.repository;

import com.biblioteca.Biblioteca.model.Mangas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MangasRepository extends JpaRepository <Mangas, Long> {

    Optional<Mangas> findMangasByName(@Param("name") String manga);

}
