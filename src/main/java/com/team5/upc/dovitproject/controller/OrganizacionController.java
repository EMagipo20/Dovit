package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Organizacion;
import com.team5.upc.dovitproject.dto.DonanteDto;
import com.team5.upc.dovitproject.serviceinterfaces.OrganizacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Organizaciones")
@PreAuthorize("hasRole('Organizacion')")
public class OrganizacionController {

    private final OrganizacionService organizacionService;

    @Autowired
    public OrganizacionController(OrganizacionService organizacionService) {
        this.organizacionService = organizacionService;
    }

    @PostMapping
    public void registrar(@RequestBody DonanteDto dto) {
        ModelMapper c = new ModelMapper();
        Organizacion o = c.map(dto, Organizacion.class);
        organizacionService.InsertarOrganizacion(o);
    }

    @GetMapping
    @PreAuthorize("hasRole('Organizacion')")
    public ResponseEntity<List<Organizacion>> ListaOrganizaciones() {
        List<Organizacion> organizaciones = organizacionService.findAllOrganizaciones();
        return ResponseEntity.ok(organizaciones);
    }

    @GetMapping("/ListarPorUbicacion")
    @PreAuthorize("hasRole('Organizacion')")
    public ResponseEntity<List<Organizacion>> listaOrganizacionesByLocation(
            @RequestParam String departamento,
            @RequestParam String distrito) {
        List<Organizacion> organizaciones = organizacionService.findByDepartamentoAndDistrito(departamento, distrito);
        return ResponseEntity.ok(organizaciones);
    }

    @GetMapping("/ListarPorCategoria")
    @PreAuthorize("hasRole('Organizacion')")
    public ResponseEntity<List<Organizacion>> listaOrganizacionesByCategory(
            @RequestParam String category) {
        List<Organizacion> organizaciones = organizacionService.findByProjectCategory(category);
        return ResponseEntity.ok(organizaciones);
    }
}
