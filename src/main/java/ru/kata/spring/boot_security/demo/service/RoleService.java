package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    Role findRoleById(Long id);

    void save(Role admin);

    Role getRoleByName(String admin);
}