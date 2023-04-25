package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.Region;
import com.kpoma.gtams.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/regions")
public class RegionController {
    private final RegionService regionService;

    @Autowired
    RegionController(RegionService regionService){
        this.regionService = regionService;
    }

    @PostMapping
    public Region addRegion(@RequestBody Region region){
        return this.regionService.addRegion(region);
    }

    @GetMapping
    public List<Region> findAllRegion(){
        return regionService.findAllRegion();
    }

    @GetMapping("/{idRegion}")
    public Optional<Region> findOneRegionById(@PathVariable long idRegion){
        return regionService.findOneRegionById(idRegion);
    }

    @GetMapping("/{name}/list")
    public Optional<List<Region>> findAllRegionByName(@PathVariable String name){
        return regionService.findAllRegionByName(name);
    }

}
