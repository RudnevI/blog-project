package com.blog.blogproject.repositories;

import com.blog.blogproject.entity.DbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<DbUser, Long> {

    DbUser findByUserName(String username);

    DbUser findByEmail(String email);
}
