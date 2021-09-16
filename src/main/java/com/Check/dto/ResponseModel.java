package com.Check.dto;

import com.Check.Entity.UserEntity;

import java.util.List;


public class ResponseModel<T,V>
{
    // An object of type T is declared
    T obj;
    V obj2;


    public ResponseModel(T obj) {  this.obj = obj; }  // constructor
    public ResponseModel(T obj,V obj2) {  this.obj = obj;this.obj2= obj2; }
    public T getResponse()  { return this.obj; }
    public V getMessage(){return this.obj2;}
}
