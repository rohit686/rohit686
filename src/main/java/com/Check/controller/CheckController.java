package com.Check.controller;

import com.Check.Entity.UserEntity;
import com.Check.dto.ResponseModel;
import com.Check.dto.UserDto;
import com.Check.repository.UserRepo;
import com.Check.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/check")
public class CheckController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/get",produces = "application/json")
    public ResponseEntity<ResponseModel<List<UserEntity>,String>> checkData(){
        List<UserEntity> userEntities = userService.findAllUser();
        ResponseModel<List<UserEntity>,String> responseModel = new ResponseModel<List<UserEntity>,String>(userEntities);

        return new ResponseEntity<>(responseModel, HttpStatus.FOUND);
    }

    @PostMapping(path = "/put",consumes = "application/json", produces = "application/json")
    public ResponseEntity<ResponseModel<UserEntity,String>> hello(@RequestBody UserDto userEntity)
    {
        ResponseModel<UserEntity,String> responseModel = new ResponseModel<>(userService.saveUser(userEntity),"sucessfull");
        return new ResponseEntity<>(responseModel,HttpStatus.FOUND);
    }
    //add method hello
}
