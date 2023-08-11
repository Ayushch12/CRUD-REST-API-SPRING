
package com.johnson.app.rest.Models;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long materialId;

    @Column
    private long magasinId;

    @Column
    private Timestamp updatedAt;

    @Column
    private String ville;

    @Column
    private Integer directeurPersonnelId;

    public long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getDirecteurPersonnelId() {
        return directeurPersonnelId;
    }

    public void setDirecteurPersonnelId(Integer directeurPersonnelId) {
        this.directeurPersonnelId = directeurPersonnelId;
    }


}