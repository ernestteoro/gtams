package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Hopital;
import com.kpoma.gtams.model.Ville;
import com.kpoma.gtams.repository.HopitalRepository;
import com.kpoma.gtams.repository.VilleRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class HopitalService {
    private final HopitalRepository hopitalRepository;

    @Autowired
    HopitalService(HopitalRepository villeRepository){
        this.hopitalRepository = villeRepository;
    }

    public Hopital addHopital(Hopital hopital){
        return this.hopitalRepository.saveAndFlush(hopital);
    }

    public List<Hopital> findAllHopital(){
        return hopitalRepository.findAll();
    }

    public Optional<Hopital> findOneHopitaleById(long idHopital){
        return hopitalRepository.findById(idHopital);
    }

    public Optional<List<Hopital>> findAllHopitalByName(String name){
        return hopitalRepository.findHopitalByNomHopital(name);
    }

}