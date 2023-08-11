package com.johnson.app.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnson.app.rest.Models.Category;
import com.johnson.app.rest.Repo.CategoryRepo;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepo categoryRepo;

    @PostMapping(value = "/saveCategory")
    public String saveCategory(@RequestBody Category category) {
        categoryRepo.save(category);
        return "Saved..!";
    }
}
