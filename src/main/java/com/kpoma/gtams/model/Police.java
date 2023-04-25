package com.kpoma.gtams.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Police {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_police", nullable = false)
    private int idPolice;
    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    private String nom;
    @Basic
    @Column(name = "sexe", nullable = true, length = 45)
    private String sexe;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;
    @Basic
    @Column(name = "grade", nullable = true, length = 45)
    private String grade;
    @Basic
    @Column(name = "nationalite", nullable = true, length = 45)
    private String nationalite;
    @Basic
    @Column(name = "addresse", nullable = true, length = 45)
    private String addresse;
    @Basic
    @Column(name = "email", nullable = true, length = 45)
    private String email;
    @Basic
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    @Basic
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());

    @JsonIgnore
    @OneToMany(mappedBy = "policeByIdPolice")
    private Collection<Accident> accidentsByIdPolice;

    public int getIdPolice() {
        return idPolice;
    }

    public void setIdPolice(int idPolice) {
        this.idPolice = idPolice;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return updatedAt;
    }

    public void setModifiedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Police police = (Police) o;
        return idPolice == police.idPolice && Objects.equals(nom, police.nom) && Objects.equals(sexe, police.sexe) && Objects.equals(age, police.age) && Objects.equals(grade, police.grade) && Objects.equals(nationalite, police.nationalite) && Objects.equals(addresse, police.addresse) && Objects.equals(email, police.email) && Objects.equals(createdAt, police.createdAt) && Objects.equals(updatedAt, police.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPolice, nom, sexe, age, grade, nationalite, addresse, email, createdAt, updatedAt);
    }

    public Collection<Accident> getAccidentsByIdPolice() {
        return accidentsByIdPolice;
    }

    public void setAccidentsByIdPolice(Collection<Accident> accidentsByIdPolice) {
        this.accidentsByIdPolice = accidentsByIdPolice;
    }

}
