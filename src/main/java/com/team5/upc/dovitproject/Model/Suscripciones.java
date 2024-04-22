package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Suscripciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Correo;
    private Date fecha_Suscripcion;
    private boolean activa;
    private String frecuencia;
    private String intereses;
    private boolean confirmada;
    private Date ultima_Emision = new Date();

    @ManyToOne
    @JoinColumn(name = "donante_id")
    private Donante donante;
}
