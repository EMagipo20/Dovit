package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Organizacion;
import com.team5.upc.dovitproject.repository.OrganizacionRepository;
import com.team5.upc.dovitproject.serviceinterfaces.OrganizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizacionServiceImplements implements OrganizacionService {

    private final OrganizacionRepository organizacionRepository;

    public OrganizacionServiceImplements(OrganizacionRepository organizacionRepository) {
        this.organizacionRepository = organizacionRepository;
    }

    @Override
    public void InsertarOrganizacion(Organizacion organizacion) {}

    @Override
    public List<Organizacion> findAllOrganizaciones() {
        return (List<Organizacion>) organizacionRepository.findAll();
    }

    @Override
    public List<Organizacion> findByDepartamentoAndDistrito(String departamento, String distrito) {
        return organizacionRepository.findByDepartamentoAndDistrito(departamento, distrito);
    }

    @Override
    public List<Organizacion> findByProjectCategory(String category) {
        return organizacionRepository.findByProjectCategory(category);
    }
}
