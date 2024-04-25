package com.team5.upc.dovitproject.repository;

import com.team5.upc.dovitproject.Model.Organizacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrganizacionRepository extends CrudRepository<Organizacion,Integer> {

    public List<Organizacion> findAll();

    @Query("SELECT o FROM Organizacion o WHERE o.departamento = :departamento AND o.distrito = :distrito")
    List<Organizacion> findByDepartamentoAndDistrito(@Param("departamento") String departamento, @Param("distrito") String distrito);

    //Buscar organizaciones por categoria de proyecto
    @Query("SELECT o FROM Organizacion o JOIN o.proyectos p WHERE p.categoria = :category")
    List<Organizacion> findByProjectCategory(@Param("category") String category);
}
