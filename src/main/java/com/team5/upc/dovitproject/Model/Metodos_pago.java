package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Metodos_pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Tipo_pago;
    private String Descripcion;
    private Boolean Activo;

    @OneToMany(mappedBy = "metodoPago")
    private List<Donaciones> donaciones;
}
