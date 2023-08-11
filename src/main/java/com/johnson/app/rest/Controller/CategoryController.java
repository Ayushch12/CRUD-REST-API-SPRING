package com.johnson.app.rest.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johnson.app.rest.Models.Category;
import com.johnson.app.rest.Repo.CategoryRepo;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepo categoryRepo;

    public CategoryController(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @PostMapping(value = "/savecategory")
    public String saveCategory(@RequestBody Category category) {
        categoryRepo.save(category);
        return "Saved..!";
    }

    @PutMapping(value = "/updatecategory/{id}")
    public String updateCategory(@PathVariable long id, @RequestBody Category updatedCategory) {

        Category existingCategory = categoryRepo.findById(id).orElse(null);
        if (existingCategory != null) {
            existingCategory.setNom(updatedCategory.getNom());
            existingCategory.setUpdatedAt(updatedCategory.getUpdatedAt());
            categoryRepo.save(existingCategory);
            return "Updated..!";
        } else {
            return "Category not found.";
        }
    }
    @DeleteMapping(value = "/deletecategory/{id}")
public String deleteCategory(@PathVariable long id) {
    Category categoryToDelete = categoryRepo.findById(id).orElse(null);

    if (categoryToDelete != null) {
        categoryRepo.delete(categoryToDelete);
        return "Deleted category with id: " + id;
    } else {
        return "Category not found with id: " + id;
    }
}

}
