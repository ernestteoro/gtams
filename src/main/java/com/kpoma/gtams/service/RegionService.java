package com.kpoma.gtams.service;

import com.kpoma.gtams.model.Region;
import com.kpoma.gtams.repository.RegionRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RegionService {
    RegionRepository regionRepository;

    @Autowired
    RegionService(RegionRepository regionRepository){
        this.regionRepository = regionRepository;
    }

    public Region addRegion(Region region){
        return this.regionRepository.saveAndFlush(region);
    }

    public List<Region> findAllRegion(){
        return regionRepository.findAll();
    }

    public Optional<Region> findOneRegionById(long idRegion){
        return regionRepository.findById(idRegion);
    }

    public Optional<List<Region>> findAllRegionByName(String name){
        return regionRepository.findRegionByNomRegion(name);
    }

}