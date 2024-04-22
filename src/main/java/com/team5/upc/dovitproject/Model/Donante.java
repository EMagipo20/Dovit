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
public class Donante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String NombreCompleto;
    private char DNI;
    private String Direccion;
    private String Telefono;
    private String Foto;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id") // usuario_id es la FK
    private Usuario usuario;

    @OneToMany(mappedBy = "donante")
    private List<Donaciones> donaciones;

    @OneToMany(mappedBy = "donante")
    private List<Suscripciones> suscripciones;
}
