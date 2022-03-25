package com.biblioteca.Biblioteca.service;

import com.biblioteca.Biblioteca.model.Autor;
import com.biblioteca.Biblioteca.repository.AutorRepository;
import exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public List<Autor> findAllAutor()
    {
        return repository.findAll();
    }

    public Autor insertAutor(Autor autor)
    {
        return repository.save(autor);
    }

    public Optional<Autor> findAutorById(Long codAutor)
    {
        Optional<Autor> optionalAutor = repository.findById(codAutor);

        return optionalAutor;
    }

    public Optional<Autor> findAutorByName(String autor)
    {
        Optional<Autor> optionalAutor = repository.findAutorByName(autor);

        return optionalAutor;
    }

    public Autor updateAutor(Autor changedAutor)
    {
        Optional<Autor> autor = repository.findById(changedAutor.getCodAutor());

        return repository.save(changedAutor);
    }

    public void deleteAutor(Long codAutor)
    {
        try
        {
            repository.deleteById(codAutor);
        }
        catch (EmptyResultDataAccessException e)
        {
            throw new ResourceNotFoundException(codAutor);
        }
    }

}
