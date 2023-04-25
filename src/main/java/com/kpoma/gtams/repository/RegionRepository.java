package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.Pays;
import com.kpoma.gtams.model.Region;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public interface RegionRepository extends JpaRepository<Region, Long> {

    Optional<List<Region>> findRegionByNomRegion(String nom);

}