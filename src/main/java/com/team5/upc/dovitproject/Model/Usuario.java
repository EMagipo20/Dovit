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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Nombre;
    private String Email;
    private String Contrasenia;
    private Date Fecha_registro = new Date();
    private char Tipo_Usuario;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Donante donante;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Organizacion organizacion;

    @OneToMany(mappedBy = "usuario")
    private List<Publicaciones_Foro> publicacionesForos;
}
