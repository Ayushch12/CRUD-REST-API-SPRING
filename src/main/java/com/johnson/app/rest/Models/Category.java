package com.johnson.app.rest.Models;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nom;

    @Column
    private String description;

    @Column
    private String marque;

    @Column
    private String imageUrl;

    public enum Taille {
        SMALL, MEDIUM, LARGE
    }

    @Column
    private Taille taille;

    @Column
    private Integer dureeLocation;

    @Column
    private BigDecimal coutLocation;

    @Column
    private BigDecimal coutRemplacement;

    @Column
    private Integer categorieId;

    @Column
    private Timestamp updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public Integer getDureeLocation() {
        return dureeLocation;
    }

    public void setDureeLocation(Integer dureeLocation) {
        this.dureeLocation = dureeLocation;
    }

    public BigDecimal getCoutLocation() {
        return coutLocation;
    }

    public void setCoutLocation(BigDecimal coutLocation) {
        this.coutLocation = coutLocation;
    }

    public BigDecimal getCoutRemplacement() {
        return coutRemplacement;
    }

    public void setCoutRemplacement(BigDecimal coutRemplacement) {
        this.coutRemplacement = coutRemplacement;
    }

    public Integer getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Integer categorieId) {
        this.categorieId = categorieId;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
