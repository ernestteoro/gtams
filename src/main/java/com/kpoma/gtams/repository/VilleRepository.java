package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.Region;
import com.kpoma.gtams.model.Ville;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public interface VilleRepository extends JpaRepository<Ville, Long> {

    Optional<List<Ville>> findVilleByNomVille(String nom);

}