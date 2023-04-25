package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Region;
import com.kpoma.gtams.model.RolesUser;
import com.kpoma.gtams.service.RegionService;
import com.kpoma.gtams.service.RolesUserService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/userRoles")
public class RolesUserController {

    private final RolesUserService rolesUserService;

    @Autowired
    RolesUserController(RolesUserService rolesUserService){
        this.rolesUserService = rolesUserService;
    }

    @PostMapping
    public RolesUser addRolesUser(@RequestBody RolesUser rolesUser){
        return this.rolesUserService.addRolesUser(rolesUser);
    }

    @GetMapping
    public List<RolesUser> findAllRolesUser(){
        return rolesUserService.findAllRolesUser();
    }

    @GetMapping("/{idRoleUser}")
    public Optional<RolesUser> findOneRolesUserById(@PathVariable long idRoleUser){
        return rolesUserService.findOneRolesUserById(idRoleUser);
    }

    @GetMapping("/{roles}/list")
    public Optional<List<RolesUser>> findAllRolesUserByName(@PathVariable String roles){
        return rolesUserService.findAllRolesUserByRoles(roles);
    }

}
