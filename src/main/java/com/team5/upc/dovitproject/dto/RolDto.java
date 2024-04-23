package com.team5.upc.dovitproject.dto;

import com.team5.upc.dovitproject.Model.Usuario;

public class RolDto {
    private int id;
    private String rol;
    private Usuario user;

    public Usuario getUsuario() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
