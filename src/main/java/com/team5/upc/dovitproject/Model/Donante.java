package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Donante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDonante")
    private int idDonante;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "contactoTelefonico")
    private String contactoTelefonico;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "direccion")
    private String direccion;

    //Relaciones

    @OneToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario") // El nombre debe coincidir con el de Usuario
    private Usuario usuario;

    @OneToMany(mappedBy = "donante")
    private List<Donaciones> donaciones;

    @OneToMany(mappedBy = "donante")
    private List<Comentarios> comentarios;

    @OneToMany(mappedBy = "donante")
    private List<Publicaciones_Foro> publicaciones_foro;
}
