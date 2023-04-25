package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Hopital;
import com.kpoma.gtams.model.LieuAccident;
import com.kpoma.gtams.repository.HopitalRepository;
import com.kpoma.gtams.repository.LieuAccidentRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LieuAccidentService {
    private final LieuAccidentRepository lieuAccidentRepository;

    @Autowired
    LieuAccidentService(LieuAccidentRepository lieuAccidentRepository){
        this.lieuAccidentRepository = lieuAccidentRepository;
    }

    public LieuAccident addLieuAccident(LieuAccident lieuAccident){
        return this.lieuAccidentRepository.saveAndFlush(lieuAccident);
    }

    public List<LieuAccident> findAllLieuAccident(){
        return lieuAccidentRepository.findAll();
    }

    public Optional<LieuAccident> findOneLieuAccidentById(long idHopital){
        return lieuAccidentRepository.findById(idHopital);
    }

    public Optional<List<LieuAccident>> findAllLieuAccidentByName(String name){
        return lieuAccidentRepository.findLieuAccidentByNomRue(name);
    }

}