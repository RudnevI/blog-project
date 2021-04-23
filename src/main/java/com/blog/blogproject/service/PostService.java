package com.blog.blogproject.service;

import com.blog.blogproject.entity.DbPost;

import java.util.List;

public interface PostService {

    List<DbPost> findAllPosts();

    List<DbPost> findAllPostsByUser(String userName);

    DbPost savePost(DbPost post);
}
