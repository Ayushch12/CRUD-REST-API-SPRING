package com.johnson.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnson.app.rest.Models.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}