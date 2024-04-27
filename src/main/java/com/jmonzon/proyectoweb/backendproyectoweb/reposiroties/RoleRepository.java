package com.jmonzon.proyectoweb.backendproyectoweb.reposiroties;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jmonzon.proyectoweb.backendproyectoweb.entities.Role;


public interface RoleRepository extends CrudRepository<Role, Long>{

    Optional<Role> findByName(String name);

}
