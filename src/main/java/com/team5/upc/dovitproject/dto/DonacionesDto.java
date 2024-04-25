package com.team5.upc.dovitproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonacionesDto {

    private int Id;
    private Double Cantidad_donada;
    private Double Fecha_donacion;
    private boolean Estado;
    private boolean anonima;
    private LocalTime Hora_donacion;
    private String Comentarios;
}
