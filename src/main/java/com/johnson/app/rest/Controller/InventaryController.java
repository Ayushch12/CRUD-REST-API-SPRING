package com.johnson.app.rest.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johnson.app.rest.Models.Inventary;
import com.johnson.app.rest.Repo.InventaryRepo;

@RestController
@RequestMapping("/inventaries")
public class InventaryController {

    private final InventaryRepo inventaryRepo;

    public InventaryController(InventaryRepo inventaryRepo) {
        this.inventaryRepo = inventaryRepo;
    }

    @PostMapping(value = "/saveinventary")
    public String saveInventary(@RequestBody Inventary inventary) {
        inventaryRepo.save(inventary);
        return "Saved..!";
    }

    @PutMapping(value = "/updateinventary/{id}")
    public String updateInventary(@PathVariable long id, @RequestBody Inventary updatedInventary) {

        Inventary existingInventary = inventaryRepo.findById(id).orElse(null);
        if (existingInventary != null) {
            existingInventary.setMaterialId(updatedInventary.getMaterialId());
            existingInventary.setMagasinId(updatedInventary.getMagasinId());
            existingInventary.setUpdatedAt(updatedInventary.getUpdatedAt());
            inventaryRepo.save(existingInventary);
            return "Updated..!";
        } else {
            return "Inventary not found.";
        }
    }

    @DeleteMapping(value = "/deleteinventary/{id}")
    public String deleteInventary(@PathVariable long id) {
        Inventary inventaryToDelete = inventaryRepo.findById(id).orElse(null);

        if (inventaryToDelete != null) {
            inventaryRepo.delete(inventaryToDelete);
            return "Deleted inventary with id: " + id;
        } else {
            return "Inventary not found with id: " + id;
        }
    }
}
