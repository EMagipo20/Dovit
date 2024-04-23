package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Rol;

import java.util.List;

public interface RolService {
    public void insert(Rol rol);

    public List<Rol> list();

    public void delete(int idRol);

    public Rol listarId(int idRol);
}
