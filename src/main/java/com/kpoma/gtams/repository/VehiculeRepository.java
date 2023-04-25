package com.kpoma.gtams.repository;

import com.kpoma.gtams.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

    Optional<List<Vehicule>> findVehiculeByMarque(String brand);
    Optional<List<Vehicule>> findVehiculeByType(String type);
    Optional<List<Vehicule>> findVehiculeByModel(String model);

    Optional<Vehicule> findVehiculeByImmatriculation(String immatriculation);

}