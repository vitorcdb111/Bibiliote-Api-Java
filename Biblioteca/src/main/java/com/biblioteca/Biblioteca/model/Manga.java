package com.biblioteca.Biblioteca.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codmanga")
    private Long codManga;
    private String name;
    private Double chapters;
    private Integer volume;
    private Autor autor;
    private Integer numPages;
}
