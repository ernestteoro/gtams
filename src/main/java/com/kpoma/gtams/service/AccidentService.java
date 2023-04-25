package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.repository.AccidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccidentService {
    private final AccidentRepository accidentRepository;

    @Autowired
    AccidentService(AccidentRepository accidentRepository){
        this.accidentRepository = accidentRepository;
    }

    public Accident addAccident(Accident accident){
        return this.accidentRepository.saveAndFlush(accident);
    }

    public List<Accident> findAllAccident(){
        return accidentRepository.findAll();
    }

    public Optional<Accident> findOneAccidentById(long idAccident){
        return accidentRepository.findById(idAccident);
    }


}
