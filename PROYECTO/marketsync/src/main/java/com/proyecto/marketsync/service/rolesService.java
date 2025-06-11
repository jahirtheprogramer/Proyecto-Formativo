package com.proyecto.marketsync.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.marketsync.model.roles;
import com.proyecto.marketsync.repository.rolesRepository;

@Service
public class rolesService {

    @Autowired
    rolesRepository rolesRepository;

    public List<roles> obtenerTodos() {
        return rolesRepository.findAll();
    }

    public roles guardaRoles(roles rol) {
        return rolesRepository.save(rol);
    }

    public roles obtenerRolPorId(Integer id) {
        return rolesRepository.findById(id).orElse(null);
    }

    public void eliminarRol(Integer id) {
        rolesRepository.deleteById(id);
    }

}
