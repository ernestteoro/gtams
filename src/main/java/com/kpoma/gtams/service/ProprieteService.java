package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Police;
import com.kpoma.gtams.model.Propriete;
import com.kpoma.gtams.repository.PoliceRepository;
import com.kpoma.gtams.repository.ProprieteRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProprieteService {

    private final ProprieteRepository proprieteRepository;

    @Autowired
    ProprieteService(ProprieteRepository proprieteRepository){
        this.proprieteRepository = proprieteRepository;
    }

    public Propriete addPropriete(Propriete police){ return this.proprieteRepository.saveAndFlush(police);}

    public List<Propriete> findAllPropriete(){
        return proprieteRepository.findAll();
    }

    public Optional<Propriete> findOneProprieteById(long idPropriete){
        return proprieteRepository.findById(idPropriete);
    }

    public Optional<List<Propriete>> findAllProprieteByName(String name){
        return proprieteRepository.findProprieteByNomPropriete(name);
    }

    public Optional<List<Propriete>> findAllProprieteByOwnerName(String name){
        return proprieteRepository.findProprieteByNomProprietaire(name);
    }
}