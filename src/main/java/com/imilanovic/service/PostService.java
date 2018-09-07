package com.imilanovic.service;

import com.imilanovic.entities.Post;
import com.imilanovic.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public List<Post> getAllPosts(){
        return  postRepository.findAll();
    }

    public void insert(Post post) {
        postRepository.save(post);
    }
}
