package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.VictimesAccidents;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public interface VictimesAccidentsRepository extends JpaRepository<VictimesAccidents, Long> {

    Optional<List<VictimesAccidents>> findVictimesAccidentsByTypeVictime(String type);
    Optional<List<VictimesAccidents>> findVictimesAccidentsByNom(String nom);
    Optional<List<VictimesAccidents>> findVictimesAccidentsByNumeroPermis(String numeroPermis);
    Optional<List<VictimesAccidents>> findVictimesAccidentsByFuisApresAccident(int status);
    Optional<List<VictimesAccidents>> findVictimesAccidentsByIdAccident(int idAccident);

}