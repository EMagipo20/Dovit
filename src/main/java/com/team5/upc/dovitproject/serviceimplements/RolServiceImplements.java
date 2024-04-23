package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Rol;
import com.team5.upc.dovitproject.repository.RolRepository;
import com.team5.upc.dovitproject.serviceinterfaces.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplements implements RolService {
    @Autowired
    private RolRepository rR;

    @Override
    public void insert(Rol rol) {
        rR.save(rol);
    }

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Rol listarId(int idRol) {
        return rR.findById(idRol).orElse(new Rol());
    }
}
