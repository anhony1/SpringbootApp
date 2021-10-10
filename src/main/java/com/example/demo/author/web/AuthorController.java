package com.example.demo.author.web;

import com.example.demo.author.business.AuthorService;
import com.example.demo.author.data.entity.AuthorEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class AuthorController {

    private final AuthorService authorService;

    @RequestMapping(path = "/authors")
    public List<AuthorEntity> getAuthors(){
        return authorService.getAuthors();
    }

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
}
