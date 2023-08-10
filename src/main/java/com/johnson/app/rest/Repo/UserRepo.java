package com.johnson.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnson.app.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long > {

}
