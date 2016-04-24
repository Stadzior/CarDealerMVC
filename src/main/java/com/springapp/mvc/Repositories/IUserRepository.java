package com.springapp.mvc.Repositories;

import com.springapp.mvc.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}