package com.atguigu.springboot04webrestfulcrud.exception;

public class UserNotExistException extends RuntimeException{

    public UserNotExistException() {
        super("user not exist exception --customer defined");
    }
}
