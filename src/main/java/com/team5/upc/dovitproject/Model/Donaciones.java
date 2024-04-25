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
    private int Id;
    private Double cantidad_donada;
    private Date fecha_donacion;
    private boolean anonima;
    private String metodo_pago;

    @ManyToOne
    @JoinColumn(name = "idDonante")
    private Donante donante;

    @ManyToOne
    @JoinColumn(name = "idProyecto")
    private Proyecto proyecto;
}
