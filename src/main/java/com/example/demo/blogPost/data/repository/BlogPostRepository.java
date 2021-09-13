package com.example.demo.blogPost.data.repository;

import com.example.demo.blogPost.data.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {

    //if any custom queries are required, this is where you make them

}
