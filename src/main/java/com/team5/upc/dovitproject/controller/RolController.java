package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Rol;
import com.team5.upc.dovitproject.dto.RolDto;
import com.team5.upc.dovitproject.serviceinterfaces.RolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private RolService rS;

    @PostMapping
    public void registrar(@RequestBody RolDto dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody RolDto dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public RolDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        RolDto dto = m.map(rS.listarId(id), RolDto.class);
        return dto;
    }

    @GetMapping
    public List<RolDto> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDto.class);
        }).collect(Collectors.toList());
    }
}
