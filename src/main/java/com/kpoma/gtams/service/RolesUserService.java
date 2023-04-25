package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Quartier;
import com.kpoma.gtams.model.RolesUser;
import com.kpoma.gtams.repository.QuartierRepository;
import com.kpoma.gtams.repository.RolesUserRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RolesUserService {


    private final RolesUserRepository rolesUserRepository;

    @Autowired
    RolesUserService(RolesUserRepository rolesUserRepository){
        this.rolesUserRepository = rolesUserRepository;
    }

    public RolesUser addRolesUser(RolesUser rolesUser){
        return this.rolesUserRepository.saveAndFlush(rolesUser);
    }

    public List<RolesUser> findAllRolesUser(){
        return rolesUserRepository.findAll();
    }

    public Optional<RolesUser> findOneRolesUserById(long idRolesUser){
        return rolesUserRepository.findById(idRolesUser);
    }

    public Optional<List<RolesUser>> findAllRolesUserByRoles(String name){
        return rolesUserRepository.findRolesUserByRoles(name);
    }

}