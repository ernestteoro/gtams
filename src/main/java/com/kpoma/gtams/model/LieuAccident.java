package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class LieuAccident {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_lieu_accident", nullable = false)
    private int idLieuAccident;
    @Basic
    @Column(name = "numero_rue", length = 45)
    private String numeroRue;
    @Basic
    @Column(name = "nom_rue", length = 245)
    private String nomRue;
    @Basic
    @Column(name = "longitude", length = 150)
    private String longitude;
    @Basic
    @Column(name = "latitude", length = 150)
    private String latitude;
    @Basic
    @Column(name = "created_at",  columnDefinition = "TIMESTAMP")
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());;
    @Basic
    @Column(name = "modified_at",  columnDefinition = "TIMESTAMP")
    private Timestamp modifiedAt = new Timestamp(System.currentTimeMillis());;

    @JsonIgnore
    @OneToMany(mappedBy = "lieuAccidentByIdLieuAccident")
    private Collection<Accident> accidentsByIdLieuAccident;
    @ManyToOne
    @JoinColumn(name = "id_quartier", referencedColumnName = "id_quartier")
    private Quartier quartierByIdQuartier;

    public int getIdLieuAccident() {
        return idLieuAccident;
    }

    public void setIdLieuAccident(int idLieuAccident) {
        this.idLieuAccident = idLieuAccident;
    }

    public String getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(String numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LieuAccident that = (LieuAccident) o;
        return idLieuAccident == that.idLieuAccident && Objects.equals(numeroRue, that.numeroRue) && Objects.equals(nomRue, that.nomRue) && Objects.equals(longitude, that.longitude) && Objects.equals(latitude, that.latitude) && Objects.equals(createdAt, that.createdAt) && Objects.equals(modifiedAt, that.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLieuAccident, numeroRue, nomRue, longitude, latitude, createdAt, modifiedAt);
    }

    public Collection<Accident> getAccidentsByIdLieuAccident() {
        return accidentsByIdLieuAccident;
    }

    public void setAccidentsByIdLieuAccident(Collection<Accident> accidentsByIdLieuAccident) {
        this.accidentsByIdLieuAccident = accidentsByIdLieuAccident;
    }

    public Quartier getQuartierByIdQuartier() {
        return quartierByIdQuartier;
    }

    public void setQuartierByIdQuartier(Quartier quartierByIdQuartier) {
        this.quartierByIdQuartier = quartierByIdQuartier;
    }
}
