package com.blog.blogproject.service;

import com.blog.blogproject.entity.DbUser;
import com.blog.blogproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {


    DbUser findUserByEmail(String email);

    DbUser findUserByUserName(String username);


    void saveUser(DbUser user);

}
