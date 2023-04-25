package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.RolesUser;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public interface RolesUserRepository extends JpaRepository<RolesUser, Long> {

    Optional<List<RolesUser>> findRolesUserByRoles(String roleUser);

    Optional<List<RolesUser>> findRolesUserByIdUsers(int idUser);

}