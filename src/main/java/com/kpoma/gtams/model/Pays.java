package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Pays {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_pays", nullable = false)
    private int idPays;
    @Basic
    @Column(name = "nom_pays", nullable = false)
    private String nomPays;
    @Basic
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());

    @JsonIgnore
    @OneToMany(mappedBy = "paysByIdPays", fetch = FetchType.LAZY)
    private Collection<Region> regionsByIdPays;

    public int getIdPays() {
        return idPays;
    }

    public void setIdPays(int idPays) {
        this.idPays = idPays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pays pays = (Pays) o;
        return idPays == pays.idPays && Objects.equals(nomPays, pays.nomPays) && Objects.equals(createdAt, pays.createdAt) && Objects.equals(updatedAt, pays.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPays, nomPays, createdAt, updatedAt);
    }

    public Collection<Region> getRegionsByIdPays() {
        return regionsByIdPays;
    }

    public void setRegionsByIdPays(Collection<Region> regionsByIdPays) {
        this.regionsByIdPays = regionsByIdPays;
    }
}
