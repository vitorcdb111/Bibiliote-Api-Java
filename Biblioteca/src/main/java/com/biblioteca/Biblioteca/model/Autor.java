package com.biblioteca.Biblioteca.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codautor")
    private Long codAutor;
    private String name;
    private Integer age;
    private String mangas;
    private String animes;
    private String biografy;


}
