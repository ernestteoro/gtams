package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.LieuAccident;
import com.kpoma.gtams.service.LieuAccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/lieuAccidents")
public class LieuAccidentController {
    private final LieuAccidentService lieuAccidentService;

    @Autowired
    LieuAccidentController(LieuAccidentService lieuAccidentService){
        this.lieuAccidentService = lieuAccidentService;
    }

    @PostMapping
    public LieuAccident addLieuAccident(@RequestBody LieuAccident lieuAccident){
        return this.lieuAccidentService.addLieuAccident(lieuAccident);
    }

    @GetMapping
    public List<LieuAccident> findAllLieuAccident(){
        return lieuAccidentService.findAllLieuAccident();
    }

    @GetMapping("{idLieuAccident}")
    public Optional<LieuAccident> findOneLieuAccidentById(long idLieuAccident){
        return lieuAccidentService.findOneLieuAccidentById(idLieuAccident);
    }

    @GetMapping("{name}/names")
    public Optional<List<LieuAccident>> findAllLieuAccidentByName(String name){
        return lieuAccidentService.findAllLieuAccidentByName(name);
    }
}
