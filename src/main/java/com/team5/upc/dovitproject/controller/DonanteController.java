package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.dto.DonanteDto;
import com.team5.upc.dovitproject.serviceinterfaces.DonanteServiceInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Donantes")
@PreAuthorize("hasRole('Donante')")
public class DonanteController {
    @Autowired
    private DonanteServiceInterface dS;

    @PostMapping("/insertar")
    public void registrar(@RequestBody DonanteDto dto) {
        ModelMapper c = new ModelMapper();
        Donante d = c.map(dto, Donante.class);
        dS.Insert(d);
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody DonanteDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        Donante d = modelMapper.map(dto, Donante.class);
        dS.Update(d);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) { dS.Delete(id); }

    @GetMapping
    @PreAuthorize("hasRole('Donante')")
    public List<DonanteDto> list() {
        return dS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, DonanteDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscar/{departamento}/{distrito}")
    @PreAuthorize("hasRole('Donante')")
    public List<Donante> listarPorDepartamentoYDistrito(@PathVariable String departamento, @PathVariable String distrito) {
        return dS.listarporDepartamentoyDistrito(departamento, distrito);
    }
}
