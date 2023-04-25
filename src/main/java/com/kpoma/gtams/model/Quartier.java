package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Quartier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_quartier", nullable = false)
    private int idQuartier;
    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    private String nom;
    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Basic
    @Column(name = "id_ville", insertable=false, updatable=false)
    private int idVille;
    @JsonIgnore
    @OneToMany(mappedBy = "quartierByIdQuartier")
    private Collection<Hopital> hopitalsByIdQuartier;
    @JsonIgnore
    @OneToMany(mappedBy = "quartierByIdQuartier")
    private Collection<LieuAccident> lieuAccidentsByIdQuartier;
    @ManyToOne
    @JoinColumn(name = "id_ville", referencedColumnName = "id_ville")
    private Ville villeByIdVille;

    public int getIdQuartier() {
        return idQuartier;
    }

    public void setIdQuartier(int idQuartier) {
        this.idQuartier = idQuartier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quartier quartier = (Quartier) o;
        return idQuartier == quartier.idQuartier && idVille == quartier.idVille && Objects.equals(nom, quartier.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuartier, nom, idVille);
    }

    public Collection<Hopital> getHopitalsByIdQuartier() {
        return hopitalsByIdQuartier;
    }

    public void setHopitalsByIdQuartier(Collection<Hopital> hopitalsByIdQuartier) {
        this.hopitalsByIdQuartier = hopitalsByIdQuartier;
    }

    public Collection<LieuAccident> getLieuAccidentsByIdQuartier() {
        return lieuAccidentsByIdQuartier;
    }

    public void setLieuAccidentsByIdQuartier(Collection<LieuAccident> lieuAccidentsByIdQuartier) {
        this.lieuAccidentsByIdQuartier = lieuAccidentsByIdQuartier;
    }

    public Ville getVilleByIdVille() {
        return villeByIdVille;
    }

    public void setVilleByIdVille(Ville villeByIdVille) {
        this.villeByIdVille = villeByIdVille;
    }
}
