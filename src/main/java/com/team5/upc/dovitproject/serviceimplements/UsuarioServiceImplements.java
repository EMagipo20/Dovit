package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Usuario;
import com.team5.upc.dovitproject.repository.UsuarioRepository;
import com.team5.upc.dovitproject.serviceinterfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplements implements UsuarioService{
    @Autowired
    private UsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Usuario listarId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }
}
