package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Usuario;

import java.util.List;

public interface UsuarioService {
    public void insert(Usuario usuario);

    public List<Usuario> list();

    public void delete(int idUsuario);

    public Usuario listarId(int idUsuario);
}
