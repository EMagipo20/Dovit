package com.team5.upc.dovitproject.repository;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Organizacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonanteRepository extends CrudRepository<Donante, Integer> {

    //Buscar donante por departamento y distrito
    @Query("SELECT o FROM Donante o WHERE o.departamento = :departamento AND o.distrito = :distrito")
    List<Donante> findByDepartamentoAndDistrito(@Param("departamento") String departamento, @Param("distrito") String distrito);
}
