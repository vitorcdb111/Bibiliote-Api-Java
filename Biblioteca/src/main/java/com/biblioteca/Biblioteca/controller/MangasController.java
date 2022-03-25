package com.biblioteca.Biblioteca.controller;


import com.biblioteca.Biblioteca.model.Manga;
import com.biblioteca.Biblioteca.service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/mangas")
public class MangasController {

    @Autowired
    private MangaService service;

    @GetMapping(value = "/")
    public List<Manga> findAllMangas()
    {
        return service.findAllMangas();
    }

    @PostMapping(value = "/insert-manga")
    public Manga insertManga(@RequestBody Manga manga)
    {
        return service.insertManga(manga);
    }

    @GetMapping(value = "find-manga/{manga}")
    public Optional<Manga> findMangaByName(@PathVariable String manga)
    {
        return service.findMangaByName(manga);
    }

    @PutMapping(value ="update-manga/{codManga}")
    public Manga updateManga(@RequestBody Manga manga)
    {
        return service.updateManga(manga);
    }

    @DeleteMapping(value = "delete/{codManga}")
    public void deleteManga(@PathVariable Long codManga)
    {
         service.deleteManga(codManga);
    }

}
