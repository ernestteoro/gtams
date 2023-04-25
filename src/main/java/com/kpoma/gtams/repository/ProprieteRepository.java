package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.Propriete;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


public interface ProprieteRepository extends JpaRepository<Propriete, Long> {

    Optional<List<Propriete>> findProprieteByNomPropriete(String name);
    Optional<List<Propriete>> findProprieteByNomProprietaire(String name);

}