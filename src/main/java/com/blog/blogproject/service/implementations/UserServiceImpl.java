package com.blog.blogproject.service.implementations;

import com.blog.blogproject.entity.DbUser;
import com.blog.blogproject.repositories.UserRepository;
import com.blog.blogproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {



    private final UserRepository repo;

    public UserServiceImpl(final UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public DbUser findUserByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public DbUser findUserByUserName(String username) {

        return repo.findByUserName(username);
    }
    @Override
    public DbUser saveUser (final DbUser user) {

        DbUser checkUser = repo.findByEmail(user.getEmail());

        if (checkUser == null){

            user.setPassword(user.getPassword());
            return repo.save(user);
        }
        return null;
    }


}
