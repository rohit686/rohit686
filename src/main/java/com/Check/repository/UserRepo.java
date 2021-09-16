package com.Check.repository;

import com.Check.Entity.UserEntity;
import com.Check.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer> {

    @Query( "select u from userdata as u where user_name= :username ")
    public UserEntity findByUserName(@Param("username")  String username1);

}
