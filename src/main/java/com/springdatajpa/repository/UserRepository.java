package com.springdatajpa.repository;

import com.springdatajpa.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    @Query(value = "SELECT username FROM user WHERE username = :username", nativeQuery = true)
    User getUser(@Param("username") String username);

}
