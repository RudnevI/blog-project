package com.blog.blogproject.repositories;

import com.blog.blogproject.entity.DbPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<DbPost, Long> {


}
