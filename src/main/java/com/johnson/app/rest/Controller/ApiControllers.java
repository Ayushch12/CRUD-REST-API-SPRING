package com.johnson.app.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnson.app.rest.Models.Category;
import com.johnson.app.rest.Models.User;
import com.johnson.app.rest.Repo.CategoryRepo;
import com.johnson.app.rest.Repo.UserRepo;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @Autowired // Added this line
    private CategoryRepo categoryRepo; // Added this line

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepo.findAll();

    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return ("Saved..!");
    }

    @PostMapping(value = "/saveCategory")
    public String saveCategory(@RequestBody Category category) { // Renamed method
        categoryRepo.save(category); // Fixed this line
        return ("Saved..!");
    }

}