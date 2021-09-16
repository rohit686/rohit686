package com.Check.jwt;

import com.Check.Entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public UserDetails getUserEntity() {
        return userEntity;
    }



    private UserDetails userEntity;
    public JwtResponse(String jwttoken,UserDetails userEntity) {
        this.jwttoken = jwttoken;
        this.userEntity= userEntity;
    }
    public String getToken() {
        return this.jwttoken;
    }
}