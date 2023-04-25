package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.VictimesAccidents;
import com.kpoma.gtams.repository.AccidentRepository;
import com.kpoma.gtams.repository.VictimesAccidentsRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class VictimesAccidentsService {

    private final VictimesAccidentsRepository victimesAccidentsRepository;

    @Autowired
    VictimesAccidentsService(VictimesAccidentsRepository victimesAccidentsRepository){
        this.victimesAccidentsRepository = victimesAccidentsRepository;
    }

    public VictimesAccidents addVictimesAccidents(VictimesAccidents victimesAccidents){
        return this.victimesAccidentsRepository.saveAndFlush(victimesAccidents);
    }

    public List<VictimesAccidents> findAllVictimesAccidents(){
        return victimesAccidentsRepository.findAll();
    }

    public Optional<VictimesAccidents> findOneVictimesAccidentsById(long idVictimesAccidents){
        return victimesAccidentsRepository.findById(idVictimesAccidents);
    }

    public Optional<List<VictimesAccidents>> findVictimesAccidentsByTypeVictime(String type){
        return this.victimesAccidentsRepository.findVictimesAccidentsByTypeVictime(type);
    }

    public Optional<List<VictimesAccidents>> findVictimesAccidentsByNom(String nom){
        return this.victimesAccidentsRepository.findVictimesAccidentsByNom(nom);
    }

    public Optional<List<VictimesAccidents>> findVictimesAccidentsByNumeroPermis(String numeroPermis){
        return  this.victimesAccidentsRepository.findVictimesAccidentsByNumeroPermis(numeroPermis);
    }

    public Optional<List<VictimesAccidents>> findVictimesAccidentsByFuisApresAccident(int status){
        return this.victimesAccidentsRepository.findVictimesAccidentsByFuisApresAccident(status);
    }

    public Optional<List<VictimesAccidents>> findVictimesAccidentsByIdAccident(int idAccident){
        return this.victimesAccidentsRepository.findVictimesAccidentsByIdAccident(idAccident);
    }

}