package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Tema;
    private String Descripcion;
    private int Cantidad_publicaciones;
    private int Cantidad_participantes;

    @ManyToOne
    @JoinColumn(name = "publicaciones_id")
    private Publicaciones_Foro publicacion;
}
