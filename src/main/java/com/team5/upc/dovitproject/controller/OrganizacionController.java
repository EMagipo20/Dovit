package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Organizacion;
import com.team5.upc.dovitproject.serviceinterfaces.OrganizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizacionController {

    private final OrganizacionService organizacionService;

    @Autowired
    public OrganizacionController(OrganizacionService organizacionService) {
        this.organizacionService = organizacionService;
    }

    @GetMapping
    public ResponseEntity<List<Organizacion>> getAllOrganizaciones() {
        List<Organizacion> organizaciones = organizacionService.findAllOrganizaciones();
        return ResponseEntity.ok(organizaciones);
    }

    @GetMapping("/search/by-location")
    public ResponseEntity<List<Organizacion>> getOrganizacionesByLocation(
            @RequestParam String departamento,
            @RequestParam String distrito) {
        List<Organizacion> organizaciones = organizacionService.findByDepartamentoAndDistrito(departamento, distrito);
        return ResponseEntity.ok(organizaciones);
    }

    @GetMapping("/search/by-category")
    public ResponseEntity<List<Organizacion>> getOrganizacionesByCategory(
            @RequestParam String category) {
        List<Organizacion> organizaciones = organizacionService.findByProjectCategory(category);
        return ResponseEntity.ok(organizaciones);
    }
}
