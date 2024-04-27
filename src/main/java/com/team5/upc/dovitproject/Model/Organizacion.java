package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrganizacion")
    private int idOrganizacion;

    @Column(name = "nombreOrganizacion")
    private String nombreOrganizacion;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "cantidadProyectos")
    private int cantidadProyectos;

    @Column(name = "nombreContacto")
    private String nombreContacto;

    @Column(name = "numeroTelefonicoRepresentante")
    private String numeroTelefonicoRepresentante;

    @Column(name = "correoElectronicoRepresentante")
    private String correoElectronicoRepresentante;

    //Relaciones
    @OneToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario") // El nombre debe coincidir con el de Usuario
    private Usuario usuario;

    @OneToMany(mappedBy = "organizacion")
    private List<Proyecto> proyectos;

    @OneToMany(mappedBy = "organizacion")
    private List<Publicaciones_Foro> publicaciones_foro;
}
