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

import com.johnson.app.rest.Models.Employe;
import com.johnson.app.rest.Repo.EmployeRepo;

@RestController
public class EmployeController {

    @Autowired
    private EmployeRepo employeRepo;

    // System CRUD

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/employes")
    public List<Employe> getEmployes() {
        return employeRepo.findAll();
    }

    // Create CRUD
    @PostMapping(value = "/save")
    public String saveEmploye(@RequestBody Employe employe) {
        employeRepo.save(employe);
        return "Saved..!";
    }

    // Update CRUD
    @PutMapping(value = "/update/{id}")
    public String updateEmploye(@PathVariable long id, @RequestBody Employe employe) {
        Employe updatedEmploye = (Employe) employeRepo.findById(id);

        if (updatedEmploye != null) {
            updatedEmploye.setNom(employe.getNom());
            updatedEmploye.setPrenom(employe.getPrenom());
            updatedEmploye.setImageUrl(employe.getImageUrl());
            updatedEmploye.setEmail(employe.getEmail());
            updatedEmploye.setLogin(employe.getLogin());
            updatedEmploye.setMdp(employe.getMdp());
            updatedEmploye.setActf(employe.getActf());
            updatedEmploye.setMagasinId(employe.getMagasinId());
            updatedEmploye.setUpdatedAt(employe.getUpdatedAt());
            employeRepo.save(updatedEmploye);
            return "Updated..!";
        }

        return "Employe not found with id: " + id;
    }

    @DeleteMapping(value = "/delete/{id}") // Delete CRUD
    public String deleteEmploye(@PathVariable long id) {
        Employe deleteEmploye = (Employe) employeRepo.findById(id);

        if (deleteEmploye != null) {
            employeRepo.delete(deleteEmploye);
            return "Deleted employe with id: " + id;
        }

        return "Employe not found with id: " + id;
    }

}
