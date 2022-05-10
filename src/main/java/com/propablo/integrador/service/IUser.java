package com.propablo.integrador.service;

import java.util.List;

import com.propablo.integrador.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IUser extends JpaRepository<User, String>{
    
  List<User> findByUsernameAndPassword(String username, String password);

}
