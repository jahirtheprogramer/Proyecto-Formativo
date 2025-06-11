package com.proyecto.marketsync.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.marketsync.model.roles;
import com.proyecto.marketsync.service.rolesService;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "*")
public class rolesController {

    @Autowired
    private rolesService rolesService;

    @GetMapping("/listar")
    public List<roles> listarRoles(@RequestParam roles roles) {
        return rolesService.obtenerTodos();
    }

    @PostMapping("/crear")
    public roles crearRol(@RequestBody roles rol) {
        return rolesService.guardaRoles(rol);

    }

    @GetMapping("/id")
    public roles obtenerRolPorId(@RequestParam Integer id) {
        return rolesService.obtenerRolPorId(id);
    }

    @PostMapping("/eliminar")
    public void eliminarRol(@RequestBody Integer id) {
        rolesService.eliminarRol(id);
    }

    @PostMapping("/actualizar")
    public roles actualizarRol(@RequestBody roles rol) {
        return rolesService.guardaRoles(rol);
    }

}
