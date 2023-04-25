package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Accident {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_accident", nullable = false)
    private int idAccident;
    @Basic
    @Column(name = "annee")
    private Integer annee;
    @Basic
    @Column(name = "mois")
    private Integer mois;
    @Basic
    @Column(name = "jour")
    private int jour;
    @Basic
    @Column(name = "date_accident")
    private Timestamp dateAccident;
    @Basic
    @Column(name = "nombre_victime")
    private Integer nombreVictime;
    @Basic
    @Column(name = "nbr_total_cond")
    private Integer nbrTotalCond;
    @Basic
    @Column(name = "nbr_cond_mort")
    private Integer nbrCondMort;
    @Basic
    @Column(name = "nbr_cond_gr_bl")
    private Integer nbrCondGrBl;
    @Basic
    @Column(name = "nbr_cond_moins_bl")
    private Integer nbrCondMoinsBl;
    @Basic
    @Column(name = "nbr_pas_mort")
    private Integer nbrPasMort;
    @Basic
    @Column(name = "nbr_pas_gr_bl")
    private Integer nbrPasGrBl;
    @Basic
    @Column(name = "nbr_pas_moins_bl")
    private Integer nbrPasMoinsBl;
    @Basic
    @Column(name = "nbr_pie_mort")
    private Integer nbrPieMort;
    @Basic
    @Column(name = "nbr_pie_gr_bl")
    private Integer nbrPieGrBl;
    @Basic
    @Column(name = "nbr_pie_moins_bl")
    private Integer nbrPieMoinsBl;
    @Basic
    @Column(name = "nbr_animal_bl")
    private Integer nbrAnimalBl;
    @Basic
    @Column(name = "nbr_animal_mort")
    private Integer nbrAnimalMort;
    @Basic
    @Column(name = "nbr_propriete_endo")
    private Integer nbrProprieteEndo;
    @Basic
    @Column(name = "condition_climat", length = 45)
    private String conditionClimat;
    @Basic
    @Column(name = "etat_route", length = 45)
    private String etatRoute;
    @Basic
    @Column(name = "condition_lumiere", length = 45)
    private String conditionLumiere;
    @Basic
    @Column(name = "type_accident", length = 45)
    private String typeAccident;
    @Basic
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Timestamp createdAt= new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "modified_at", columnDefinition = "TIMESTAMP")
    private Timestamp modifiedAt= new Timestamp(System.currentTimeMillis());

    @Basic
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_lieu_accident", referencedColumnName = "id_lieu_accident", nullable = false)
    private LieuAccident lieuAccidentByIdLieuAccident;

    @ManyToOne
    @JoinColumn(name = "id_police", referencedColumnName = "id_police", nullable = false)
    private Police policeByIdPolice;
    @JsonIgnore
    @OneToMany(mappedBy = "accidentByIdAccident")
    private Collection<Propriete> proprietesByIdAccident;
    @JsonIgnore
    @OneToMany(mappedBy = "accidentByIdAccident")
    private Collection<Vehicule> vehiculesByIdAccident;
    @JsonIgnore
    @OneToMany(mappedBy = "accidentByIdAccident")
    private Collection<VictimesAccidents> victimesAccidentsByIdAccident;

    public int getIdAccident() {
        return idAccident;
    }

    public void setIdAccident(int idAccident) {
        this.idAccident = idAccident;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
        this.mois = mois;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public Timestamp getDateAccident() {
        return dateAccident;
    }

    public void setDateAccident(Timestamp dateAccident) {
        this.dateAccident = dateAccident;
    }

    public Integer getNombreVictime() {
        return nombreVictime;
    }

    public void setNombreVictime(Integer nombreVictime) {
        this.nombreVictime = nombreVictime;
    }

    public Integer getNbrTotalCond() {
        return nbrTotalCond;
    }

    public void setNbrTotalCond(Integer nbrTotalCond) {
        this.nbrTotalCond = nbrTotalCond;
    }

    public Integer getNbrCondMort() {
        return nbrCondMort;
    }

    public void setNbrCondMort(Integer nbrCondMort) {
        this.nbrCondMort = nbrCondMort;
    }

    public Integer getNbrCondGrBl() {
        return nbrCondGrBl;
    }

    public void setNbrCondGrBl(Integer nbrCondGrBl) {
        this.nbrCondGrBl = nbrCondGrBl;
    }

    public Integer getNbrCondMoinsBl() {
        return nbrCondMoinsBl;
    }

    public void setNbrCondMoinsBl(Integer nbrCondMoinsBl) {
        this.nbrCondMoinsBl = nbrCondMoinsBl;
    }

    public Integer getNbrPasMort() {
        return nbrPasMort;
    }

    public void setNbrPasMort(Integer nbrPasMort) {
        this.nbrPasMort = nbrPasMort;
    }

    public Integer getNbrPasGrBl() {
        return nbrPasGrBl;
    }

    public void setNbrPasGrBl(Integer nbrPasGrBl) {
        this.nbrPasGrBl = nbrPasGrBl;
    }

    public Integer getNbrPasMoinsBl() {
        return nbrPasMoinsBl;
    }

    public void setNbrPasMoinsBl(Integer nbrPasMoinsBl) {
        this.nbrPasMoinsBl = nbrPasMoinsBl;
    }

    public Integer getNbrPieMort() {
        return nbrPieMort;
    }

    public void setNbrPieMort(Integer nbrPieMort) {
        this.nbrPieMort = nbrPieMort;
    }

    public Integer getNbrPieGrBl() {
        return nbrPieGrBl;
    }

    public void setNbrPieGrBl(Integer nbrPieGrBl) {
        this.nbrPieGrBl = nbrPieGrBl;
    }

    public Integer getNbrPieMoinsBl() {
        return nbrPieMoinsBl;
    }

    public void setNbrPieMoinsBl(Integer nbrPieMoinsBl) {
        this.nbrPieMoinsBl = nbrPieMoinsBl;
    }

    public Integer getNbrAnimalBl() {
        return nbrAnimalBl;
    }

    public void setNbrAnimalBl(Integer nbrAnimalBl) {
        this.nbrAnimalBl = nbrAnimalBl;
    }

    public Integer getNbrAnimalMort() {
        return nbrAnimalMort;
    }

    public void setNbrAnimalMort(Integer nbrAnimalMort) {
        this.nbrAnimalMort = nbrAnimalMort;
    }

    public Integer getNbrProprieteEndo() {
        return nbrProprieteEndo;
    }

    public void setNbrProprieteEndo(Integer nbrProprieteEndo) {
        this.nbrProprieteEndo = nbrProprieteEndo;
    }

    public String getConditionClimat() {
        return conditionClimat;
    }

    public void setConditionClimat(String conditionClimat) {
        this.conditionClimat = conditionClimat;
    }

    public String getEtatRoute() {
        return etatRoute;
    }

    public void setEtatRoute(String etatRoute) {
        this.etatRoute = etatRoute;
    }

    public String getConditionLumiere() {
        return conditionLumiere;
    }

    public void setConditionLumiere(String conditionLumiere) {
        this.conditionLumiere = conditionLumiere;
    }

    public String getTypeAccident() {
        return typeAccident;
    }

    public void setTypeAccident(String typeAccident) {
        this.typeAccident = typeAccident;
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
        Accident accident = (Accident) o;
        return idAccident == accident.idAccident && Objects.equals(annee, accident.annee) && Objects.equals(mois, accident.mois) && Objects.equals(jour, accident.jour) && Objects.equals(dateAccident, accident.dateAccident) && Objects.equals(nombreVictime, accident.nombreVictime) && Objects.equals(nbrTotalCond, accident.nbrTotalCond) && Objects.equals(nbrCondMort, accident.nbrCondMort) && Objects.equals(nbrCondGrBl, accident.nbrCondGrBl) && Objects.equals(nbrCondMoinsBl, accident.nbrCondMoinsBl) && Objects.equals(nbrPasMort, accident.nbrPasMort) && Objects.equals(nbrPasGrBl, accident.nbrPasGrBl) && Objects.equals(nbrPasMoinsBl, accident.nbrPasMoinsBl) && Objects.equals(nbrPieMort, accident.nbrPieMort) && Objects.equals(nbrPieGrBl, accident.nbrPieGrBl) && Objects.equals(nbrPieMoinsBl, accident.nbrPieMoinsBl) && Objects.equals(nbrAnimalBl, accident.nbrAnimalBl) && Objects.equals(nbrAnimalMort, accident.nbrAnimalMort) && Objects.equals(nbrProprieteEndo, accident.nbrProprieteEndo) && Objects.equals(conditionClimat, accident.conditionClimat) && Objects.equals(etatRoute, accident.etatRoute) && Objects.equals(conditionLumiere, accident.conditionLumiere) && Objects.equals(typeAccident, accident.typeAccident) && Objects.equals(createdAt, accident.createdAt) && Objects.equals(modifiedAt, accident.modifiedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccident, annee, mois, jour, dateAccident, nombreVictime, nbrTotalCond, nbrCondMort, nbrCondGrBl, nbrCondMoinsBl, nbrPasMort, nbrPasGrBl, nbrPasMoinsBl, nbrPieMort, nbrPieGrBl, nbrPieMoinsBl, nbrAnimalBl, nbrAnimalMort, nbrProprieteEndo, conditionClimat, etatRoute, conditionLumiere, typeAccident, createdAt, modifiedAt);
    }

    public LieuAccident getLieuAccidentByIdLieuAccident() {
        return lieuAccidentByIdLieuAccident;
    }

    public void setLieuAccidentByIdLieuAccident(LieuAccident lieuAccidentByIdLieuAccident) {
        this.lieuAccidentByIdLieuAccident = lieuAccidentByIdLieuAccident;
    }

    public Police getPoliceByIdPolice() {
        return policeByIdPolice;
    }

    public void setPoliceByIdPolice(Police policeByIdPolice) {
        this.policeByIdPolice = policeByIdPolice;
    }

    public Collection<Propriete> getProprietesByIdAccident() {
        return proprietesByIdAccident;
    }

    public void setProprietesByIdAccident(Collection<Propriete> proprietesByIdAccident) {
        this.proprietesByIdAccident = proprietesByIdAccident;
    }

    public Collection<Vehicule> getVehiculesByIdAccident() {
        return vehiculesByIdAccident;
    }

    public void setVehiculesByIdAccident(Collection<Vehicule> vehiculesByIdAccident) {
        this.vehiculesByIdAccident = vehiculesByIdAccident;
    }

    public Collection<VictimesAccidents> getVictimesAccidentsByIdAccident() {
        return victimesAccidentsByIdAccident;
    }

    public void setVictimesAccidentsByIdAccident(Collection<VictimesAccidents> victimesAccidentsByIdAccident) {
        this.victimesAccidentsByIdAccident = victimesAccidentsByIdAccident;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
