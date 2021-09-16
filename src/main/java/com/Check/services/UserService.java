package com.Check.services;

import com.Check.Entity.UserEntity;
import com.Check.dto.UserDto;
import com.Check.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<UserEntity> findAllUser(){
        return userRepo.findAll();
    }

    public UserEntity findUserByName(String userName){
        return userRepo.findByUserName(userName);
    }

    public UserEntity saveUser(UserDto userEntity){
        UserEntity entity = new UserEntity();
        entity.setUserName(userEntity.getUsername());
        entity.setPassword(userEntity.getPassword());
        return userRepo.save(entity);
    }
}
