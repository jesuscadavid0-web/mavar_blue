package com.example.mavarblue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mavarblue.models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}
