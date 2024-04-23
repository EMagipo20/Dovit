package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
public class Donaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDonaciones")
    private Integer id;

    @Column(name = "cantidadMonetaria")
    private Integer cantidadMonetaria;

    @Column(name = "fechaDonacion")
    @Temporal(TemporalType.DATE)
    private Date fechaDonacion;

    @Column(name = "metodoDePago")
    private String metodoDePago;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "idDonante")
    private Donante donante;

    @ManyToOne
    @JoinColumn(name = "idProyecto")
    private Proyecto proyecto;
}
