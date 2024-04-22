package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Titulo;
    private String Descripcion;
    private Boolean Estado;
    private Double Monto_recaudado;
    private Double Monto_objetivo;
    private Date Fecha_Inicio = new Date();
    private Date Fecha_Fin = new Date();
    private String Detalles;
    private String Categoria;

    @ManyToOne
    @JoinColumn(name = "organizacion_id")
    private Organizacion organizacion;

    @OneToMany(mappedBy = "proyecto")
    private List<Donaciones> donaciones;
}
