package com.proyecto.marketsync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.marketsync.model.usuarios;

@Repository
public interface usuariosRepository extends JpaRepository<usuarios, Integer> {

}
