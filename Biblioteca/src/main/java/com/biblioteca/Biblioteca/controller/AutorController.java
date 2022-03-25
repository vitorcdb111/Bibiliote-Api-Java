package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.model.Autor;
import com.biblioteca.Biblioteca.model.Manga;
import com.biblioteca.Biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/autores")
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping(value = "/")
    public List<Autor> findAllAutor()
    {
        return service.findAllAutor();
    }

    @PostMapping(value = "/insert-autor")
    public Autor insertAutor(@RequestBody Autor autor)
    {
        return service.insertAutor(autor);
    }

    @GetMapping(value = "find-autor/{autor}")
    public Optional<Autor> findAutorByName(@PathVariable String autor)
    {
        return service.findAutorByName(autor);
    }

    @PutMapping(value ="update-autor/{codAutor}")
    public Autor updateManga(@RequestBody Autor autor)
    {
        return service.updateAutor(autor);
    }

    @DeleteMapping(value = "delete/{codAutor}")
    public void deleteManga(@PathVariable Long codAutor)
    {
        service.deleteAutor(codAutor);
    }


}
