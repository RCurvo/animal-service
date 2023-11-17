package br.com.rcurvo.animalservice.entities;


import jakarta.persistence.*;

import java.sql.Date;


@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    @Column(nullable = false)
    private String provisionalName;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private Integer estimatedAge;
    @Column(nullable = false)
    private String breed;

    @Column(nullable = false)
    private Date entryDate;

    @Column
    private Date adoptionDate;

    @Column(nullable = false)
    private String entryConditions;

    @Column(nullable = false)
    private String receptorName;

    @Column
    private Date deathDate;

    @Column(nullable = false)
    private String animalSize;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getProvisionalName() {
        return provisionalName;
    }

    public void setProvisionalName(String provisionalName) {
        this.provisionalName = provisionalName;
    }

    public Integer getEstimatedAge() {
        return estimatedAge;
    }

    public void setEstimatedAge(Integer estimatedAge) {
        this.estimatedAge = estimatedAge;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(Date adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getEntryConditions() {
        return entryConditions;
    }

    public void setEntryConditions(String entryConditions) {
        this.entryConditions = entryConditions;
    }

    public String getReceptorName() {
        return receptorName;
    }

    public void setReceptorName(String receptorName) {
        this.receptorName = receptorName;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public String getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(String animalSize) {
        this.animalSize = animalSize;
    }
}
