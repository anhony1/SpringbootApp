package com.example.demo.author.business;

import com.example.demo.author.data.entity.AuthorEntity;
import com.example.demo.author.data.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public List<AuthorEntity> getAuthors() {

        return this.authorRepository.findAll();

    }


}
