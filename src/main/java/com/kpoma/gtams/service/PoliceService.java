package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Police;
import com.kpoma.gtams.repository.PoliceRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PoliceService {

    private final PoliceRepository policeRepository;

    @Autowired
    PoliceService(PoliceRepository villeRepository){
        this.policeRepository = villeRepository;
    }

    public Police addPolice(Police police){ return this.policeRepository.saveAndFlush(police);}

    public List<Police> findAllPolice(){
        return policeRepository.findAll();
    }

    public Optional<Police> findOnePoliceById(long idPolice){
        return policeRepository.findById(idPolice);
    }

    public Optional<List<Police>> findAllPoliceByName(String name){
        return policeRepository.findPoliceByNom(name);
    }


}