package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Hopital;
import com.kpoma.gtams.service.HopitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/hopitals")
public class HopitalController {

    private  final HopitalService hopitalService;

    @Autowired
    HopitalController(HopitalService hopitalService){
        this.hopitalService = hopitalService;
    }

    @PostMapping
    public Hopital addHopital(@RequestBody Hopital hopital){
        return this.hopitalService.addHopital(hopital);
    }

    @GetMapping
    public List<Hopital> findAllHopital(){
        return hopitalService.findAllHopital();
    }

    @GetMapping("/{idHopital}")
    public Optional<Hopital> findOneHopitalById(@PathVariable long idHopital){
        return hopitalService.findOneHopitaleById(idHopital);
    }

    @GetMapping("/{name}/list")
    public Optional<List<Hopital>> findAllHopitalByName(@PathVariable String name){
        return hopitalService.findAllHopitalByName(name);
    }
}
