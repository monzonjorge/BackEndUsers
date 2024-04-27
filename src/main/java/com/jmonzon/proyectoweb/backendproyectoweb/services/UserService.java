package com.jmonzon.proyectoweb.backendproyectoweb.services;

import java.util.List;

import com.jmonzon.proyectoweb.backendproyectoweb.entities.User;

public interface UserService {

    List<User> findAll();

    User save(User user);
}
