package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Donante;

import java.util.List;

public interface DonanteServiceInterface {
    public void Insert(Donante donante);
    public List<Donante> list();
    public void Update(Donante donante);
    public void Delete(int idDonante);
    List<Donante> listarporDepartamentoyDistrito(String departamento, String distrito);
}
