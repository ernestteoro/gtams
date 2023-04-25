package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Quartier;
import com.kpoma.gtams.service.QuartierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/quartiers")
public class QuartierController {

    private  final QuartierService quartierService;

    @Autowired
    QuartierController(QuartierService quartierService){
        this.quartierService = quartierService;
    }

    @PostMapping
    public Quartier addQuartier(@RequestBody Quartier quartier){
        return this.quartierService.addQuartier(quartier);
    }

    @GetMapping
    public List<Quartier> findAllQuartier(){
        return quartierService.findAllQuartier();
    }

    @GetMapping("/{idQuartier}")
    public Optional<Quartier> findOneQuartierById(@PathVariable long idQuartier){
        return quartierService.findOneQuartierById(idQuartier);
    }

    @GetMapping("/{name}/list")
    public Optional<List<Quartier>> findAllQuartierByName(@PathVariable String name){
        return quartierService.findAllQuartierByName(name);
    }
}
