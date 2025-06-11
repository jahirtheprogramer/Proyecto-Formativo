package com.proyecto.marketsync.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.marketsync.model.usuarios;
import com.proyecto.marketsync.repository.usuariosRepository;

@Service
public class usuariosService {

    @Autowired
    usuariosRepository usuariosRepository;

    public List<usuarios> obtenerTodos() {
        return usuariosRepository.findAll();
    }

    public usuarios guardaUsuarios(usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    public usuarios obtenerUsuarioPorId(Integer id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    public void eliminarUsuario(Integer id) {
        usuariosRepository.deleteById(id);
    }

    public usuarios actualizarUsuario(usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

}
