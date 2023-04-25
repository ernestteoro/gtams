package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.Vehicule;
import com.kpoma.gtams.repository.AccidentRepository;
import com.kpoma.gtams.repository.VehiculeRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class VehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Autowired
    VehiculeService(VehiculeRepository vehiculeRepository){
        this.vehiculeRepository = vehiculeRepository;
    }

    public Vehicule addVehicule(Vehicule vehicule){
        return this.vehiculeRepository.saveAndFlush(vehicule);
    }

    public List<Vehicule> findAllVehicule(){
        return vehiculeRepository.findAll();
    }

    public Optional<Vehicule> findOneVehiculeById(long idAccident){
        return vehiculeRepository.findById(idAccident);
    }

    public Optional<List<Vehicule>> findVehiculeByBrand(String brand){
        return vehiculeRepository.findVehiculeByMarque(brand);
    }

    public Optional<List<Vehicule>> findVehiculeByType(String type){
        return vehiculeRepository.findVehiculeByType(type);
    }

    public Optional<List<Vehicule>> findVehiculeByModel(String model){
        return vehiculeRepository.findVehiculeByModel(model);
    }



}