// package com.johnson.app.rest.Controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.johnson.app.rest.Models.Category;
// import com.johnson.app.rest.Models.User;
// import com.johnson.app.rest.Repo.CategoryRepo;
// import com.johnson.app.rest.Repo.UserRepo;

// @RestController
// public class ApiControllers {

//     @Autowired
//     private UserRepo userRepo;

//      @Autowired
//     private CategoryRepo categoryRepo;

//     @GetMapping(value = "/")
//     public String getPage() {
//         return "Welcome";
//     }

//     @GetMapping(value = "/users")
//     public List<User> getUsers() {
//         return userRepo.findAll();

//     }

//     @PostMapping(value = "/save")
//     public String saveUser(@RequestBody User user) {
//         userRepo.save(user);
//         return ("Saved..!");
//     }

//     @PostMapping(value = "/saveCategory")
//     public String saveUser(@RequestBody Category category) {
//         categoryRepo .save(category);
//         return ("Saved..!");
//     }

// }

package com.johnson.app.rest.Controller; // Corrected package name

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @Autowired
    private CategoryRepo categoryRepo;

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
        return "Saved..!";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
            User updatedUser = userRepo.findById(id).get();
            updatedUser.setNom(user.getNom());
            updatedUser.setDescription(user.getDescription());
            updatedUser.setMarque(user.getMarque());
            updatedUser.setImageUrl(user.getImageUrl());
            updatedUser.setTaille(user.getTaille());
            updatedUser.setDureeLocation(user.getDureeLocation());
            updatedUser.setCoutLocation(user.getCoutLocation());
            updatedUser.setCategorieId(user.getCategorieId());
            updatedUser.setUpdatedAt(user.getUpdatedAt());
            userRepo.save(updatedUser);
            return "Updated..!";

        }
        @DeleteMapping(value = "/delete/{id}") // Corrected mapping value
        public String deleteUser(@PathVariable long id) {
            User deleteUser = userRepo.findById(id).orElse(null);

            if (deleteUser != null) {
                userRepo.delete(deleteUser);
                return "Deleted user with id: " + id;
            } else {
                return "User not found with id: " + id;
            }
        }




    @PostMapping(value = "/saveCategory")
    public String saveCategory(@RequestBody Category category) {
        categoryRepo.save(category);
        return "Saved..!";
    }
}
