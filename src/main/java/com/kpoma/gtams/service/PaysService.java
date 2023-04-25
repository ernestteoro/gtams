package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Pays;
import com.kpoma.gtams.repository.PaysRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PaysService {

    PaysRepository paysRepository;

    @Autowired
    PaysService(PaysRepository paysRepository){
        this.paysRepository = paysRepository;
    }

    public Pays addPays(Pays pays){
        return this.paysRepository.saveAndFlush(pays);
    }

    public List<Pays> findAllPays(){
        return paysRepository.findAll();
    }

    public Optional<Pays> findOnePaysById(long idPays){
        return paysRepository.findById(idPays);
    }

    public Optional<List<Pays>> findAllPaysByName(String name){
        return paysRepository.findPaysByNomPays(name);
    }

}