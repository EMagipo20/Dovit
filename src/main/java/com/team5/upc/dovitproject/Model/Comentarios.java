package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

@Entity
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComentario")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idProyecto")
    private Proyecto proyecto;

    @ManyToOne
    @JoinColumn(name = "idDonante")
    private Donante donante;
}
