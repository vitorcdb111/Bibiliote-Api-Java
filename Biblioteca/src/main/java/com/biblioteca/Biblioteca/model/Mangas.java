package com.biblioteca.Biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mangas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codmanga")
    private Long codManga;
    private String name;
    private Double chapter;
    private Integer volume;
}
