package com.proyecto.marketsync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.marketsync.model.roles;

@Repository
public interface rolesRepository extends JpaRepository<roles, Integer> {

}
