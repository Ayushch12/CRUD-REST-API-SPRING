package com.johnson.app.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnson.app.rest.Models.Magasin;
import com.johnson.app.rest.Repo.MagasinRepo;

@RestController
public class MagasinController {

    @Autowired
    private MagasinRepo magasinRepo;

    // Système CRUD

    @GetMapping(value = "/magasins")
    public List<Magasin> getMagasins() {
        return magasinRepo.findAll();
    }

    // Lire CRUD
    @PostMapping(value = "/saveMagasin")
    public String saveMagasin(@RequestBody Magasin magasin) {
        magasinRepo.save(magasin);
        return "Saved Magasin..!";
    }

    // Mis à jour CRUD
    @PutMapping(value = "/updateMagasin/{id}")
    public String updateMagasin(@PathVariable long id, @RequestBody Magasin magasin) {
        Magasin updatedMagasin = magasinRepo.findById(id).orElse(null);
        if (updatedMagasin != null) {
            updatedMagasin.setVille(magasin.getVille());
            updatedMagasin.setDirecteurPersonnelId(magasin.getDirecteurPersonnelId());
            updatedMagasin.setUpdatedAt(magasin.getUpdatedAt());
            magasinRepo.save(updatedMagasin);
            return "Updated Magasin..!";
        } else {
            return "Magasin not found with id: " + id;
        }
    }

    @DeleteMapping(value = "/deleteMagasin/{id}") // Supprimer CRUD
    public String deleteMagasin(@PathVariable long id) {
        Magasin deleteMagasin = magasinRepo.findById(id).orElse(null);

        if (deleteMagasin != null) {
            magasinRepo.delete(deleteMagasin);
            return "Deleted Magasin with id: " + id;
        } else {
            return "Magasin not found with id: " + id;
        }
    }
}
