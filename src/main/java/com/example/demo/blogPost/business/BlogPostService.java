package com.example.demo.blogPost.business;

import com.example.demo.blogPost.data.entity.BlogPost;
import com.example.demo.blogPost.data.repository.BlogPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    public BlogPostService(BlogPostRepository blogPostRepository){
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getBlogPost(){
        return blogPostRepository.findAll();
    }

}
