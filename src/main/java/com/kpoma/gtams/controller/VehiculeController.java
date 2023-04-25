package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Hopital;
import com.kpoma.gtams.model.Vehicule;
import com.kpoma.gtams.service.HopitalService;
import com.kpoma.gtams.service.VehiculeService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/vehicules")
public class VehiculeController {

    private  final VehiculeService vehiculeService;

    @Autowired
    VehiculeController(VehiculeService vehiculeService){
        this.vehiculeService = vehiculeService;
    }

    @PostMapping
    public Vehicule addVehicule(@RequestBody Vehicule vehicule){
        return this.vehiculeService.addVehicule(vehicule);
    }

    @GetMapping
    public List<Vehicule> findAllVehicule(){
        return vehiculeService.findAllVehicule();
    }

    @GetMapping("/{idVehicule}")
    public Optional<Vehicule> findOneVehiculeById(@PathVariable long idVehicule){
        return vehiculeService.findOneVehiculeById(idVehicule);
    }

    @GetMapping("/{brand}/brand")
    public Optional<List<Vehicule>> findAllVehiculeByBrand(@PathVariable String brand){
        return vehiculeService.findVehiculeByBrand(brand);
    }

    @GetMapping("/{model}/model")
    public Optional<List<Vehicule>> findAllVehiculeByModel(@PathVariable String model){
        return vehiculeService.findVehiculeByBrand(model);
    }

    @GetMapping("/{type}/model")
    public Optional<List<Vehicule>> findAllVehiculeByType(@PathVariable String type){
        return vehiculeService.findVehiculeByType(type);
    }

}
