package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Accident;
import com.kpoma.gtams.model.Users;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Optional<Users> findUsersByUsername(String name);

}