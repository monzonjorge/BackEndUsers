package com.jmonzon.proyectoweb.backendproyectoweb.reposiroties;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jmonzon.proyectoweb.backendproyectoweb.entities.User;


public interface UserRepository extends CrudRepository<User, Long>{
    
    Optional<User> findByUsername(String username);
}
