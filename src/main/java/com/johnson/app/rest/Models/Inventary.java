
package com.johnson.app.rest.Models;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  inventaireId;

    @Column
    private Integer  materialId;

    @Column
    private Integer  magasinId;

    @Column
    private Timestamp updatedAt;

    public Integer getInventaireId() {
        return inventaireId;
    }

    public void setInventaireId(Integer inventaireId) {
        this.inventaireId = inventaireId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(Integer magasinId) {
        this.magasinId = magasinId;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }



}