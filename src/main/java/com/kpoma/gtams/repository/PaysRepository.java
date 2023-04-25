package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.Pays;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public interface PaysRepository extends JpaRepository<Pays, Long> {

    Optional<List<Pays>> findPaysByNomPays(String nomPays);
}