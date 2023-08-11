package com.johnson.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnson.app.rest.Models.Magasin;  // Assuming you have a Magasin entity

public interface MagasinRepo extends JpaRepository<Magasin, Long> {

}
