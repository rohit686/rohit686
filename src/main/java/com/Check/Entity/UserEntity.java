package com.Check.Entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity(name = "userdata")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;

    @Column(name = "user_name")
    String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "password")
    String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString(){
        return "UserEntity->"+getUserName()+"--"+getPassword()+"--"+getUserId();

    }



}
