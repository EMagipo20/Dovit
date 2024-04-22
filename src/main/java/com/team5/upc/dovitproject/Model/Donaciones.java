package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private Double Cantidad_donada;
    private Double Fecha_donacion;
    private boolean Estado;
    private boolean anonima;
    private LocalTime Hora_donacion;
    private String Comentarios;

    @ManyToOne
    @JoinColumn(name = "donante_id")
    private Donante donante;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

    @ManyToOne
    @JoinColumn(name = "metodo_pago_id")
    private Metodos_pago metodoPago;
}
