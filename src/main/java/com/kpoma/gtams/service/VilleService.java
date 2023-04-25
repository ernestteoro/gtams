package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Ville;
import com.kpoma.gtams.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VilleService {
    private final VilleRepository villeRepository;

    @Autowired
    VilleService(VilleRepository villeRepository){
        this.villeRepository = villeRepository;
    }

    public Ville addVille(Ville ville){
        return this.villeRepository.saveAndFlush(ville);
    }

    public List<Ville> findAllVille(){
        return villeRepository.findAll();
    }

    public Optional<Ville> findOneVilleById(long idVille){
        return villeRepository.findById(idVille);
    }

    public Optional<List<Ville>> findAllVilleByName(String name){
        return villeRepository.findVilleByNomVille(name);
    }

}