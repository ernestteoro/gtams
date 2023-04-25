package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Hopital;
import com.kpoma.gtams.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface HopitalRepository extends JpaRepository<Hopital, Long> {

    Optional<List<Hopital>> findHopitalByNomHopital(String nom);
}