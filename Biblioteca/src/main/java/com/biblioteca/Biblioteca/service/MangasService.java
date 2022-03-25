package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.model.Mangas;
import com.biblioteca.Biblioteca.repository.MangasRepository;
import exceptions.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class MangasService {

    @Autowired
    private MangasRepository repository;

    public List<Mangas> findAllMangas()
    {
        return repository.findAll();
    }

    public Mangas insertManga(Mangas manga)
    {
        return repository.save(manga);
    }

    public Optional<Mangas> findMangaById(Long codManga)
    {
        Optional<Mangas> optionalManga = repository.findById(codManga);

        return optionalManga;
    }

    public Optional<Mangas> findMangaByName(String manga)
    {
        Optional<Mangas> optionalManga = repository.findMangasByName(manga);

        return optionalManga;
    }

    public Mangas updateManga(Mangas changedManga)
    {
        Optional<Mangas> manga = repository.findById(changedManga.getCodManga());

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
