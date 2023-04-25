package com.kpoma.gtams.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Vehicule {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_vehicule", nullable = false)
    private int idVehicule;
    @Basic
    @Column(name = "marque", nullable = true, length = 45)
    private String marque;
    @Basic
    @Column(name = "model", nullable = true, length = 45)
    private String model;
    @Basic
    @Column(name = "type", nullable = true, length = 45)
    private String type;
    @Basic
    @Column(name = "immatriculation", nullable = true, length = 45)
    private String immatriculation;
    @Basic
    @Column(name = "propriete", nullable = true, length = 45)
    private String propriete;
    @Basic
    @Column(name = "etat_domage", nullable = true, length = 45)
    private String etatDomage;
    @Basic
    @Column(name = "vitesse_estimee", nullable = true, length = 45)
    private String vitesseEstimee;
    @Basic
    @Column(name = "nom_proprietaire", nullable = true, length = 45)
    private String nomProprietaire;
    @Basic
    @Column(name = "partie_endomagee", nullable = true, length = 45)
    private String partieEndomagee;
    @Basic
    @Column(name = "societe_assurance", nullable = true, length = 45)
    private String societeAssurance;
    @Basic
    @Column(name = "numero_assurance", nullable = true, length = 45)
    private String numeroAssurance;
    @Basic
    @Column(name = "date_expiration_assurance", nullable = true, length = 45)
    private String dateExpirationAssurance;
    @Basic
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "id_accident", insertable=false, updatable=false)
    private int idAccident;
    @ManyToOne
    @JoinColumn(name = "id_accident", referencedColumnName = "id_accident", nullable = false)
    private Accident accidentByIdAccident;

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getPropriete() {
        return propriete;
    }

    public void setPropriete(String propriete) {
        this.propriete = propriete;
    }

    public String getEtatDomage() {
        return etatDomage;
    }

    public void setEtatDomage(String etatDomage) {
        this.etatDomage = etatDomage;
    }

    public String getVitesseEstimee() {
        return vitesseEstimee;
    }

    public void setVitesseEstimee(String vitesseEstimee) {
        this.vitesseEstimee = vitesseEstimee;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getPartieEndomagee() {
        return partieEndomagee;
    }

    public void setPartieEndomagee(String partieEndomagee) {
        this.partieEndomagee = partieEndomagee;
    }

    public String getSocieteAssurance() {
        return societeAssurance;
    }

    public void setSocieteAssurance(String societeAssurance) {
        this.societeAssurance = societeAssurance;
    }

    public String getNumeroAssurance() {
        return numeroAssurance;
    }

    public void setNumeroAssurance(String numeroAssurance) {
        this.numeroAssurance = numeroAssurance;
    }

    public String getDateExpirationAssurance() {
        return dateExpirationAssurance;
    }

    public void setDateExpirationAssurance(String dateExpirationAssurance) {
        this.dateExpirationAssurance = dateExpirationAssurance;
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

    public int getIdAccident() {
        return idAccident;
    }

    public void setIdAccident(int idAccident) {
        this.idAccident = idAccident;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return idVehicule == vehicule.idVehicule && idAccident == vehicule.idAccident && Objects.equals(marque, vehicule.marque) && Objects.equals(model, vehicule.model) && Objects.equals(type, vehicule.type) && Objects.equals(immatriculation, vehicule.immatriculation) && Objects.equals(propriete, vehicule.propriete) && Objects.equals(etatDomage, vehicule.etatDomage) && Objects.equals(vitesseEstimee, vehicule.vitesseEstimee) && Objects.equals(nomProprietaire, vehicule.nomProprietaire) && Objects.equals(partieEndomagee, vehicule.partieEndomagee) && Objects.equals(societeAssurance, vehicule.societeAssurance) && Objects.equals(numeroAssurance, vehicule.numeroAssurance) && Objects.equals(dateExpirationAssurance, vehicule.dateExpirationAssurance) && Objects.equals(createdAt, vehicule.createdAt) && Objects.equals(updatedAt, vehicule.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVehicule, marque, model, type, immatriculation, propriete, etatDomage, vitesseEstimee, nomProprietaire, partieEndomagee, societeAssurance, numeroAssurance, dateExpirationAssurance, createdAt, updatedAt, idAccident);
    }

    public Accident getAccidentByIdAccident() {
        return accidentByIdAccident;
    }

    public void setAccidentByIdAccident(Accident accidentByIdAccident) {
        this.accidentByIdAccident = accidentByIdAccident;
    }
}
