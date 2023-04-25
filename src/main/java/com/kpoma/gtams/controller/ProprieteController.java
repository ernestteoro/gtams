package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Police;
import com.kpoma.gtams.model.Propriete;
import com.kpoma.gtams.service.PoliceService;
import com.kpoma.gtams.service.ProprieteService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/proprietes")
public class ProprieteController {

    private final ProprieteService proprieteService;

    @Autowired
    ProprieteController(ProprieteService proprieteService){
        this.proprieteService = proprieteService;
    }

    @PostMapping
    public Propriete addPropriete(Propriete propriete){ return this.proprieteService.addPropriete(propriete);}

    @GetMapping
    public List<Propriete> findAllPropriete(){
        return proprieteService.findAllPropriete();
    }

    @GetMapping("/{idPropriete}")
    public Optional<Propriete> findOneProprieteById(@PathVariable long idPropriete){
        return proprieteService.findOneProprieteById(idPropriete);
    }

    @GetMapping("/{name}/list")
    public Optional<List<Propriete>> findAllProprieteByName(@PathVariable String name){
        return proprieteService.findAllProprieteByName(name);
    }

    @GetMapping("/{name}/ownersname")
    public Optional<List<Propriete>> findAllProprieteByOwnerName(@PathVariable String name){
        return proprieteService.findAllProprieteByOwnerName(name);
    }


}
