package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Ville;
import com.kpoma.gtams.service.VilleService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/villes")
public class VilleController {
    private  final VilleService villeService;

    @Autowired
    VilleController(VilleService villeService){
        this.villeService = villeService;
    }

    @PostMapping
    public Ville addVille(@RequestBody Ville Ville){
        return this.villeService.addVille(Ville);
    }

    @GetMapping
    public List<Ville> findAllVille(){
        return villeService.findAllVille();
    }

    @GetMapping("/{idVille}")
    public Optional<Ville> findOneVilleById(@PathVariable long idVille){
        return villeService.findOneVilleById(idVille);
    }

    @GetMapping("/{name}/list")
    public Optional<List<Ville>> findAllVilleByName(@PathVariable String name){
        return villeService.findAllVilleByName(name);
    }
}
