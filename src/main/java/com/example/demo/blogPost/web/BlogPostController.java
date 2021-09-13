package com.example.demo.blogPost.web;

import com.example.demo.blogPost.business.BlogPostService;
import com.example.demo.blogPost.data.entity.BlogPost;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class BlogPostController {

    private final BlogPostService blogPostService;

    @RequestMapping(path = "/blogPost")
    public List<BlogPost> getBlogPost(){
        return blogPostService.getBlogPost();
    }

    @RequestMapping(path = "/testing2")
    public String getTestingCall(){
        return "Github test";
    }

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }
}
