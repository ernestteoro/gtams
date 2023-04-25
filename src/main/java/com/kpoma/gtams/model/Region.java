package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_region", nullable = false)
    private int idRegion;
    @Basic
    @Column(name = "nom_region", nullable = false)
    private String nomRegion;
    @Basic
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());

    /*
    @JsonProperty(access =JsonProperty.Access.READ_ONLY)
    @Basic
    @Column(name = "id_pays")
    private int idPays;

     */

    @ManyToOne
    @JoinColumn(name = "id_pays", referencedColumnName = "id_pays")
    private Pays paysByIdPays;

    @JsonIgnore
    @OneToMany(mappedBy = "regionByIdRegion")
    private Collection<Ville> villesByIdRegion;

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
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
/*
    public int getIdPays() {
        return idPays;
    }

    public void setIdPays(int idPays) {
        this.idPays = idPays;
    }

 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return idRegion == region.idRegion && Objects.equals(nomRegion, region.nomRegion) && Objects.equals(createdAt, region.createdAt) && Objects.equals(updatedAt, region.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegion, nomRegion, createdAt, updatedAt);
    }

    public Pays getPaysByIdPays() {
        return paysByIdPays;
    }

    public void setPaysByIdPays(Pays paysByIdPays) {
        this.paysByIdPays = paysByIdPays;
    }

    public Collection<Ville> getVillesByIdRegion() {
        return villesByIdRegion;
    }

    public void setVillesByIdRegion(Collection<Ville> villesByIdRegion) {
        this.villesByIdRegion = villesByIdRegion;
    }
}
