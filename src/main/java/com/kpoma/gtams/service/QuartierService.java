package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Quartier;
import com.kpoma.gtams.repository.QuartierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuartierService {
    
    private final QuartierRepository quartierRepository;

    @Autowired
    QuartierService(QuartierRepository quartierRepository){
        this.quartierRepository = quartierRepository;
    }

    public Quartier addQuartier(Quartier Quartier){
        return this.quartierRepository.saveAndFlush(Quartier);
    }

    public List<Quartier> findAllQuartier(){
        return quartierRepository.findAll();
    }

    public Optional<Quartier> findOneQuartierById(long idQuartier){
        return quartierRepository.findById(idQuartier);
    }

    public Optional<List<Quartier>> findAllQuartierByName(String name){
        return quartierRepository.findQuartierByNom(name);
    }

}