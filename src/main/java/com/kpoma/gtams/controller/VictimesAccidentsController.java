package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Hopital;
import com.kpoma.gtams.model.VictimesAccidents;
import com.kpoma.gtams.service.HopitalService;
import com.kpoma.gtams.service.VictimesAccidentsService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/victimesAccidents")
public class VictimesAccidentsController {


    private  final VictimesAccidentsService victimesAccidentsService;

    @Autowired
    VictimesAccidentsController(VictimesAccidentsService victimesAccidentsService){
        this.victimesAccidentsService = victimesAccidentsService;
    }

    @PostMapping("{idVictimAccident}/update")
    public VictimesAccidents updateVictimesAccidents(){
        return new VictimesAccidents();
    }

    @PostMapping
    public VictimesAccidents addVictimesAccidents(@RequestBody VictimesAccidents victimesAccidentsService){
        return this.victimesAccidentsService.addVictimesAccidents(victimesAccidentsService);
    }

    @GetMapping
    public List<VictimesAccidents> findAllVictimesAccidents(){
        return victimesAccidentsService.findAllVictimesAccidents();
    }

    @GetMapping("/{idVictimesAccident}/one")
    public VictimesAccidents findOneVictimesAccidentsById(@PathVariable long idVictimesAccident){
        return victimesAccidentsService.findOneVictimesAccidentsById(idVictimesAccident).orElse(null);
    }

    @GetMapping("/{type}/type")
    public List<VictimesAccidents> findVictimesAccidentsByTypeVictime(String type){
        return this.victimesAccidentsService.findVictimesAccidentsByTypeVictime(type).orElse(null);
    }

    @GetMapping("/{nom}/nom")
    public List<VictimesAccidents> findVictimesAccidentsByNom(String nom){
        return this.victimesAccidentsService.findVictimesAccidentsByNom(nom).orElse(null);
    }

    @GetMapping("/{numeroPermis}/permis")
    public List<VictimesAccidents> findVictimesAccidentsByNumeroPermis(String numeroPermis){
        return  this.victimesAccidentsService.findVictimesAccidentsByNumeroPermis(numeroPermis).orElse(null);
    }

    @GetMapping("/{status}/status")
    public List<VictimesAccidents> findVictimesAccidentsByFuisApresAccident(int status){
        return this.victimesAccidentsService.findVictimesAccidentsByFuisApresAccident(status).orElse(null);
    }

    @GetMapping("/{idAccident}/accident")
    public List<VictimesAccidents> findVictimesAccidentsByIdAccident(int idAccident){
        return this.victimesAccidentsService.findVictimesAccidentsByIdAccident(idAccident).orElse(null);
    }


}
