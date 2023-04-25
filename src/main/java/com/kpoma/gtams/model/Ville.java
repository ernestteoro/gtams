package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Ville {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_ville", nullable = false)
    private int idVille;
    @Basic
    @Column(name = "nom_ville", nullable = false)
    private String nomVille;
    @Basic
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "id_region", insertable=false, updatable=false)
    private int idRegion;

    @JsonIgnore
    @OneToMany(mappedBy = "villeByIdVille")
    private Collection<Quartier> quartiersByIdVille;

    @ManyToOne
    @JoinColumn(name = "id_region", referencedColumnName = "id_region", nullable = false)
    private Region regionByIdRegion;

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getupdatedAt() {
        return updatedAt;
    }

    public void setupdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return idVille == ville.idVille && idRegion == ville.idRegion && Objects.equals(nomVille, ville.nomVille) && Objects.equals(createdAt, ville.createdAt) && Objects.equals(updatedAt, ville.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVille, nomVille, createdAt, updatedAt, idRegion);
    }

    public Collection<Quartier> getQuartiersByIdVille() {
        return quartiersByIdVille;
    }

    public void setQuartiersByIdVille(Collection<Quartier> quartiersByIdVille) {
        this.quartiersByIdVille = quartiersByIdVille;
    }

    public Region getRegionByIdRegion() {
        return regionByIdRegion;
    }

    public void setRegionByIdRegion(Region regionByIdRegion) {
        this.regionByIdRegion = regionByIdRegion;
    }
}
