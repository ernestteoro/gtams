package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.Hopital;
import com.kpoma.gtams.service.AccidentService;
import com.kpoma.gtams.service.HopitalService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/accidents")
public class AccidentController {
    private  final AccidentService accidentService;

    @Autowired
    AccidentController(AccidentService accidentService){
        this.accidentService = accidentService;
    }

    @PostMapping
    public Accident addAccident(@RequestBody Accident accident){
        return this.accidentService.addAccident(accident);
    }

    @GetMapping
    public List<Accident> findAllAccident(){
        return accidentService.findAllAccident();
    }

    @GetMapping("/{idAccident}")
    public Optional<Accident> findOneAccidentById(@PathVariable long idAccident){
        return accidentService.findOneAccidentById(idAccident);
    }
}
