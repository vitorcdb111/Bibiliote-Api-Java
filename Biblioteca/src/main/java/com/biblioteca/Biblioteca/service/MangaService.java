package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.model.Manga;
import com.biblioteca.Biblioteca.repository.MangaRepository;
import exceptions.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class MangaService {

    @Autowired
    private MangaRepository repository;

    public List<Manga> findAllMangas()
    {
        return repository.findAll();
    }

    public Manga insertManga(Manga manga)
    {
        return repository.save(manga);
    }

    public Optional<Manga> findMangaById(Long codManga)
    {
        Optional<Manga> optionalManga = repository.findById(codManga);

        return optionalManga;
    }

    public Optional<Manga> findMangaByName(String manga)
    {
        Optional<Manga> optionalManga = repository.findMangasByName(manga);

        return optionalManga;
    }

    public Manga updateManga(Manga changedManga)
    {
        Optional<Manga> manga = repository.findById(changedManga.getCodManga());

        return repository.save(changedManga);
    }

    public void deleteManga(Long codManga)
    {
        try
        {
            repository.deleteById(codManga);
        }
        catch (EmptyResultDataAccessException e)
        {
            throw new ResourceNotFoundException(codManga);
        }
    }

}
