package com.blog.blogproject.service.implementations;

import com.blog.blogproject.entity.DbPost;
import com.blog.blogproject.repositories.PostRepository;
import com.blog.blogproject.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {



    private final PostRepository repo;

    public PostServiceImpl(PostRepository repo) {
        this.repo = repo;
    }


    @Override
    public List<DbPost> findAllPosts() {
        return repo.findAll();
    }

    @Override
    public List<DbPost> findAllPostsByUser(String userName) {
        return null;
    }

    @Override
    public DbPost savePost(DbPost post) {
        return repo.save(post);
    }


}
