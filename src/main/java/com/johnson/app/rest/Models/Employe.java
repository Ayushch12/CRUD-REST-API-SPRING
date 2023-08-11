package com.johnson.app.rest.Models;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeId;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String imageUrl;

    @Column
    private String email;

    @Column
    private String login;

    @Column
    private String mdp;

    @Column
    private String actf;

    @Column
    private long magasinId;

    @Column
    private Timestamp updatedAt;

    public long getEmployeId() {
        return employeId;
    }

    public void setEmployeId(long employeId) {
        this.employeId = employeId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getActf() {
        return actf;
    }

    public void setActf(String actf) {
        this.actf = actf;
    }

    public long getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(long magasinId) {
        this.magasinId = magasinId;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

}
