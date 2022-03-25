package com.biblioteca.Biblioteca.model;

import lombok.Data;

import java.util.List;

@Data
public class Anime {

    private Integer codAnime;
    private String name;
    private List<Autor> autor;
    private Integer episode;
    private Integer season;

}
