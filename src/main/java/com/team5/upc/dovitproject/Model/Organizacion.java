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
public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Nombre;
    private String Descripcion;
    private String Ubicacion;
    private int Cantidad_proyectos;
    private String Imagen;
    private String Informacion_contacto;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id") // usuario_id es la FK
    private Usuario usuario;

    @OneToMany(mappedBy = "organizacion")
    private List<Proyecto> proyectos;
}
