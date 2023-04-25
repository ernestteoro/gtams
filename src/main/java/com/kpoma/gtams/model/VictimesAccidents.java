package com.kpoma.gtams.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class VictimesAccidents {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_accident_victimes", nullable = false)
    private int idAccidentVictimes;
    @Basic
    @Column(name = "id_accident", insertable=false, updatable=false)
    private int idAccident;
    @Basic
    @Column(name = "id_hopital", nullable = false)
    private int idHopital;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    private String nom;
    @Basic
    @Column(name = "sexe", nullable = true, length = 45)
    private String sexe;
    @Basic
    @Column(name = "profession", nullable = true, length = 255)
    private String profession;
    @Basic
    @Column(name = "nationalite", nullable = true, length = 45)
    private String nationalite;
    @Basic
    @Column(name = "address", nullable = true, length = 255)
    private String address;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;

    @Basic
    @Column(name = "id_vehicule", nullable = true)
    private int idVehicule;

    @Basic
    @Column(name = "niveau_blessure", nullable = true, length = 255)
    private String niveauBlessure;
    @Basic
    @Column(name = "numero_permis", nullable = true, length = 255)
    private String numeroPermis;
    @Basic
    @Column(name = "lieu_delivrance_permis", nullable = true, length = 255)
    private String lieuDelivrancePermis;
    @Basic
    @Column(name = "condition_conduite", nullable = true, length = 45)
    private String conditionConduite;
    @Basic
    @Column(name = "fuis_apres_accident", nullable = true)
    private Integer fuisApresAccident;
    @Basic
    @Column(name = "lien_avec_vehicule", nullable = true, length = 45)
    private String lienAvecVehicule;
    @Basic
    @Column(name = "type_victime", nullable = true, length = 150)
    private String typeVictime;
    @Basic
    @Column(name = "seat_position", nullable = true, length = 45)
    private String seatPosition;
    @ManyToOne
    @JoinColumn(name = "id_accident", referencedColumnName = "id_accident", nullable = false)
    private Accident accidentByIdAccident;

    public int getIdAccidentVictimes() {
        return idAccidentVictimes;
    }

    public void setIdAccidentVictimes(int idAccidentVictimes) {
        this.idAccidentVictimes = idAccidentVictimes;
    }

    public int getIdAccident() {
        return idAccident;
    }

    public void setIdAccident(int idAccident) {
        this.idAccident = idAccident;
    }

    public int getIdHopital() {
        return idHopital;
    }

    public void setIdHopital(int idHopital) {
        this.idHopital = idHopital;
    }

    public Timestamp getCreateAt() {
        return createdAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createdAt = createAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNiveauBlessure() {
        return niveauBlessure;
    }

    public void setNiveauBlessure(String niveauBlessure) {
        this.niveauBlessure = niveauBlessure;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }

    public String getLieuDelivrancePermis() {
        return lieuDelivrancePermis;
    }

    public void setLieuDelivrancePermis(String lieuDelivrancePermis) {
        this.lieuDelivrancePermis = lieuDelivrancePermis;
    }

    public String getConditionConduite() {
        return conditionConduite;
    }

    public void setConditionConduite(String conditionConduite) {
        this.conditionConduite = conditionConduite;
    }

    public Integer getFuisApresAccident() {
        return fuisApresAccident;
    }

    public void setFuisApresAccident(Integer fuisApresAccident) {
        this.fuisApresAccident = fuisApresAccident;
    }

    public String getLienAvecVehicule() {
        return lienAvecVehicule;
    }

    public void setLienAvecVehicule(String lienAvecVehicule) {
        this.lienAvecVehicule = lienAvecVehicule;
    }

    public String getTypeVictime() {
        return typeVictime;
    }

    public void setTypeVictime(String typeVictime) {
        this.typeVictime = typeVictime;
    }

    public String getSeatPosition() {
        return seatPosition;
    }

    public void setSeatPosition(String seatPosition) {
        this.seatPosition = seatPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VictimesAccidents that = (VictimesAccidents) o;
        return idAccidentVictimes == that.idAccidentVictimes && idAccident == that.idAccident && idHopital == that.idHopital && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(nom, that.nom) && Objects.equals(sexe, that.sexe) && Objects.equals(profession, that.profession) && Objects.equals(nationalite, that.nationalite) && Objects.equals(address, that.address) && Objects.equals(age, that.age) && Objects.equals(niveauBlessure, that.niveauBlessure) && Objects.equals(numeroPermis, that.numeroPermis) && Objects.equals(lieuDelivrancePermis, that.lieuDelivrancePermis) && Objects.equals(conditionConduite, that.conditionConduite) && Objects.equals(fuisApresAccident, that.fuisApresAccident) && Objects.equals(lienAvecVehicule, that.lienAvecVehicule) && Objects.equals(typeVictime, that.typeVictime) && Objects.equals(seatPosition, that.seatPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccidentVictimes, idAccident, idHopital, createdAt, updatedAt, nom, sexe, profession, nationalite, address, age, niveauBlessure, numeroPermis, lieuDelivrancePermis, conditionConduite, fuisApresAccident, lienAvecVehicule, typeVictime, seatPosition);
    }

    public Accident getAccidentByIdAccident() {
        return accidentByIdAccident;
    }

    public void setAccidentByIdAccident(Accident accidentByIdAccident) {
        this.accidentByIdAccident = accidentByIdAccident;
    }
}
