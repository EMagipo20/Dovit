package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.repository.DonanteRepository;
import com.team5.upc.dovitproject.serviceinterfaces.DonanteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DonanteServiceImplements implements DonanteServiceInterface {
    @Autowired
    private DonanteRepository dR;

    @Override
    public void Insert(Donante donante) { dR.save(donante); }

    @Override
    public void Update(Donante donante) { dR.save(donante); }

    @Override
    public List<Donante> list() { return (List<Donante>) dR.findAll(); }

    @Override
    public void Delete(int idDonante) { dR.deleteById(idDonante); }

    @Override
    public List<Donante> listarporDepartamentoyDistrito(String departamento, String distrito) {
        return dR.findByDepartamentoAndDistrito(departamento, distrito);
    }
}
