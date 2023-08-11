
package com.johnson.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnson.app.rest.Models.Inventary;

public interface InventaryRepo extends JpaRepository<Inventary, Long> {
}
