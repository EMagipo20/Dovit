package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProyectos")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "monto_recaudado")
    private Double monto_recaudado;

    @Column(name = "monto_objetivo")
    private Double monto_objetivo;

    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @Column(name = "categoria")
    private String categoria;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "idOrganizacion")
    private Organizacion organizacion;

    @OneToMany(mappedBy = "proyecto")
    private List<Donaciones> donaciones;

    @OneToMany(mappedBy = "proyecto")
    private List<Comentarios> comentarios;
}
