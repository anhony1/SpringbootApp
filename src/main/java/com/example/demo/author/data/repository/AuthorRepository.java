package com.example.demo.author.data.repository;

import com.example.demo.author.data.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

    //if there are any custom queries that are required, this is where you create them.
}
