package com.blog.blogproject.service;

import com.blog.blogproject.entity.DbPost;

import java.util.List;

public interface PostService {

    public List<DbPost>findAllPosts();

    public List<DbPost>findAllPostsByUser(String userName);
}
