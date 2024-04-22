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
public class Publicaciones_Foro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String Contenido;
    private Date Fecha_publicacion = new Date();
    private Date Ultima_actualizacion = new Date();
    private int Cantidad_respuestas;
    private int Cantidad_likes;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
