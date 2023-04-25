package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Police;
import com.kpoma.gtams.model.Ville;
import com.kpoma.gtams.repository.PoliceRepository;
import com.kpoma.gtams.repository.VilleRepository;
import com.kpoma.gtams.service.PoliceService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/polices")
public class PoliceController {

    private final PoliceService policeService;

    @Autowired
    PoliceController(PoliceService policeService){
        this.policeService = policeService;
    }

    @PostMapping
    public Police addPolice(@RequestBody Police police){ return this.policeService.addPolice(police);}

    @GetMapping
    public List<Police> findAllPolice(){
        return policeService.findAllPolice();
    }

    @GetMapping("/{idPolice}")
    public Optional<Police> findOnePoliceById(@PathVariable long idPolice){
        return policeService.findOnePoliceById(idPolice);
    }

    @GetMapping("/{name}/list")
    public Optional<List<Police>> findAllPoliceByName(@PathVariable String name){
        return policeService.findAllPoliceByName(name);
    }


}
