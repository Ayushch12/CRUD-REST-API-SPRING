
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
    private long inventaireId;

    @Column
    private long materialId;

    @Column
    private long magasinId;

    @Column
    private Timestamp updatedAt;

    public long getInventaireId() {
        return inventaireId;
    }

    public void setInventaireId(long inventaireId) {
        this.inventaireId = inventaireId;
    }

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

}