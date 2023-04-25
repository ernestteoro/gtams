package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.LieuAccident;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface LieuAccidentRepository extends JpaRepository<LieuAccident, Long> {

    Optional<List<LieuAccident>> findLieuAccidentByNomRue(String nomRue);

}