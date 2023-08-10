package com.johnson.app.rest.Models;

import java.security.Timestamp;
import java.text.DecimalFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private  String  nom; // Changed 'string' to 'String'

    @Column
    private String description; // Changed 'string' to 'String'

    @Column
    private String marque; // Changed 'string' to 'String'

    @Column
    private String image_url; // Changed 'string' to 'String'

    @Column
    private Enum taille; // Changed 'string' to 'String'

    @Column
    private Integer duree_location;

    @Column
    private DecimalFormat cout_location;

    @Column
    private DecimalFormat cout_remplacement;

    @Column
    private Integer categorie_id;

    @Column
    private Timestamp updated_at;

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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Enum getTaille() {
        return taille;
    }

    public void setTaille(Enum taille) {
        this.taille = taille;
    }

    public Integer getDuree_location() {
        return duree_location;
    }

    public void setDuree_location(Integer duree_location) {
        this.duree_location = duree_location;
    }

    public DecimalFormat getCout_location() {
        return cout_location;
    }

    public void setCout_location(DecimalFormat cout_location) {
        this.cout_location = cout_location;
    }

    public DecimalFormat getCout_remplacement() {
        return cout_remplacement;
    }

    public void setCout_remplacement(DecimalFormat cout_remplacement) {
        this.cout_remplacement = cout_remplacement;
    }

    public Integer getCategorie_id() {
        return categorie_id;
    }

    public void setCategorie_id(Integer categorie_id) {
        this.categorie_id = categorie_id;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }


}
