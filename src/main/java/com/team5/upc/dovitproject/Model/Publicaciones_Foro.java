package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Publicaciones_Foro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPublicaciones")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "contenido")
    private String contenido;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "idDonante")
    private Donante donante;

    @ManyToOne
    @JoinColumn(name = "idOrganizacion")
    private Organizacion organizacion;

    @ManyToOne
    @JoinColumn(name = "idForo")
    private Foros foros;
}
