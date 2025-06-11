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

import com.proyecto.marketsync.model.usuarios;
import com.proyecto.marketsync.service.usuariosService;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class usuariosController {

    @Autowired
    private usuariosService usuariosService;

    @GetMapping("/listar")
    public List<usuarios> listarUsuarios(@RequestParam usuarios usuarios) {
        return usuariosService.obtenerTodos();
    }

    @PostMapping
    public usuarios CrearUsuario(@RequestBody usuarios usuarios) {
        return usuariosService.guardaUsuarios(usuarios);
    }

    @GetMapping("/id")
    public usuarios obtenerUsuarioPorId(@RequestParam Integer id) {
        return usuariosService.obtenerUsuarioPorId(id);
    }

    @PostMapping("/eliminar")
    public void eliminarUsuario(@RequestBody Integer id) {
        usuariosService.eliminarUsuario(id);
    }

    @PostMapping("/actualizar")
    public usuarios actualizarUsuario(@RequestBody usuarios usuario) {
        return usuariosService.actualizarUsuario(usuario);
    }

}
