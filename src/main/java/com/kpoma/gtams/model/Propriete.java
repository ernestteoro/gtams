package com.kpoma.gtams.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Propriete {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_propriete", nullable = false)
    private int idPropriete;
    @Basic
    @Column(name = "nom_propriete", nullable = true, length = 45)
    private String nomPropriete;
    @Basic
    @Column(name = "description_propriete", nullable = true, length = 255)
    private String descriptionPropriete;
    @Basic
    @Column(name = "nom_proprietaire", nullable = true, length = 45)
    private String nomProprietaire;
    @Basic
    @Column(name = "type_propriete", nullable = true, length = 45)
    private String typePropriete;
    @Basic
    @Column(name = "id_accident", insertable=false, updatable=false)
    private int idAccident;
    @ManyToOne
    @JoinColumn(name = "id_accident", referencedColumnName = "id_accident", nullable = false)
    private Accident accidentByIdAccident;

    public int getIdPropriete() {
        return idPropriete;
    }

    public void setIdPropriete(int idPropriete) {
        this.idPropriete = idPropriete;
    }

    public String getNomPropriete() {
        return nomPropriete;
    }

    public void setNomPropriete(String nomPropriete) {
        this.nomPropriete = nomPropriete;
    }

    public String getDescriptionPropriete() {
        return descriptionPropriete;
    }

    public void setDescriptionPropriete(String descriptionPropriete) {
        this.descriptionPropriete = descriptionPropriete;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getTypePropriete() {
        return typePropriete;
    }

    public void setTypePropriete(String typePropriete) {
        this.typePropriete = typePropriete;
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
        Propriete propriete = (Propriete) o;
        return idPropriete == propriete.idPropriete && idAccident == propriete.idAccident && Objects.equals(nomPropriete, propriete.nomPropriete) && Objects.equals(descriptionPropriete, propriete.descriptionPropriete) && Objects.equals(nomProprietaire, propriete.nomProprietaire) && Objects.equals(typePropriete, propriete.typePropriete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPropriete, nomPropriete, descriptionPropriete, nomProprietaire, typePropriete, idAccident);
    }

    public Accident getAccidentByIdAccident() {
        return accidentByIdAccident;
    }

    public void setAccidentByIdAccident(Accident accidentByIdAccident) {
        this.accidentByIdAccident = accidentByIdAccident;
    }
}
