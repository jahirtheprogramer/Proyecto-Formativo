package com.proyecto.marketsync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.marketsync.model.tipo_documento;

@Repository
public interface tipo_documentoRepository extends JpaRepository<tipo_documento, Integer> {

}
