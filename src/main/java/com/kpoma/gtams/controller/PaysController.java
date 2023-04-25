package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Pays;
import com.kpoma.gtams.service.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pays")
public class PaysController {

    private final PaysService paysService;

    @Autowired
    PaysController(PaysService paysService){
        this.paysService = paysService;
    }

    @PostMapping
    public Pays addPays(@RequestBody Pays pays){
        return paysService.addPays(pays);
    }

    @GetMapping
    public List<Pays> findAllPays(){
        return paysService.findAllPays();
    }

    @GetMapping("/{idPays}")
    public Optional<Pays> findOnePays(@PathVariable long idPays){
        return paysService.findOnePaysById(idPays);
    }

    @GetMapping("/{name}/list")
    public Optional<List<Pays>> findAllPaysByName(@PathVariable String name){
        return paysService.findAllPaysByName(name);
    }

}
