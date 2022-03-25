package com.biblioteca.Biblioteca.repository;

import com.biblioteca.Biblioteca.model.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MangaRepository extends JpaRepository <Manga, Long> {

    Optional<Manga> findMangasByName(@Param("name") String manga);

}
