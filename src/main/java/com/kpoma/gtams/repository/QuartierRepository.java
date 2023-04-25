package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.Quartier;
import com.kpoma.gtams.model.Ville;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public interface QuartierRepository extends JpaRepository<Quartier, Long> {
    Optional<List<Quartier>> findQuartierByNom(String nom);
}