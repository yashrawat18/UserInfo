package com.userinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userinfo.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
