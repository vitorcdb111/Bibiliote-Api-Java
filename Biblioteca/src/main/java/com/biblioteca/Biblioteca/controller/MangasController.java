package com.biblioteca.Biblioteca.controller;


import com.biblioteca.Biblioteca.model.Mangas;
import com.biblioteca.Biblioteca.service.MangasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/mangas")
public class MangasController {

    @Autowired
    private MangasService service;

    @GetMapping(value = "/")
    public List<Mangas> findAllMangas()
    {
        return service.findAllMangas();
    }

    @PostMapping(value = "/insert-manga")
    public Mangas insertManga(@RequestBody Mangas manga)
    {
        return service.insertManga(manga);
    }

    @GetMapping(value = "find-manga/{manga}")
    public Optional<Mangas> findMangaByName(@PathVariable String manga)
    {
        return service.findMangaByName(manga);
    }

    @PutMapping(value ="update-manga/{codManga}")
    public Mangas updateManga(@RequestBody Mangas manga)
    {
        return service.updateManga(manga);
    }

    @DeleteMapping(value = "delete/{codManga}")
    public void deleteManga(@PathVariable Long codManga)
    {
         service.deleteManga(codManga);
    }

}
