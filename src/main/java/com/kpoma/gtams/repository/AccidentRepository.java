package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface AccidentRepository extends JpaRepository<Accident, Long> {

    Optional<List<Accident>> findAccidentByAnnee(int annee);

    Optional<List<Accident>> findAccidentByMois(int mois);

    Optional<List<Accident>> findAccidentByNombreVictime(int nombreVictime);

    @Query(name = "SELECT * FROM ACCIDENT a WHERE a.description LIKE %:description%", nativeQuery = true)
    Optional<List<Accident>> findAccidentByDescription(String description);

    Optional<List<Accident>> findAccidentByNbrPasMort(int nombre);

    Optional<List<Accident>> findAccidentByNbrPasGrBlAndNbrPasMoinsBl(int nbrPasGrBl, int nbrPasMoinsBl);

    Optional<List<Accident>> findAccidentByJour(int jour);

    Optional<List<Accident>> findAccidentByMois(Integer mois);

    Optional<List<Accident>> findAccidentByAnnee(Integer annee);

}
