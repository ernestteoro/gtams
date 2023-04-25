package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Hopital {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_hopital", nullable = false)
    private int idHopital;
    @Basic
    @Column(name = "nom_hopital", nullable = true, length = 45)
    private String nomHopital;
    @Basic
    @Column(name = "id_quartier", insertable=false, updatable=false)
    private int idQuartier;

    @ManyToOne
    @JoinColumn(name = "id_quartier", referencedColumnName = "id_quartier", nullable = false)
    private Quartier quartierByIdQuartier;

    public int getIdHopital() {
        return idHopital;
    }

    public void setIdHopital(int idHopital) {
        this.idHopital = idHopital;
    }

    public String getNomHopital() {
        return nomHopital;
    }

    public void setNomHopital(String nomHopital) {
        this.nomHopital = nomHopital;
    }

    public int getIdQuartier() {
        return idQuartier;
    }

    public void setIdQuartier(int idQuartier) {
        this.idQuartier = idQuartier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hopital hopital = (Hopital) o;
        return idHopital == hopital.idHopital && idQuartier == hopital.idQuartier && Objects.equals(nomHopital, hopital.nomHopital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHopital, nomHopital, idQuartier);
    }

    public Quartier getQuartierByIdQuartier() {
        return quartierByIdQuartier;
    }

    public void setQuartierByIdQuartier(Quartier quartierByIdQuartier) {
        this.quartierByIdQuartier = quartierByIdQuartier;
    }
}
