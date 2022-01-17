package com.example.myfirstrestapp;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TodoRepository extends CrudRepository<Todo,Integer> {

    Set<Todo> findAllByUserId(int userId);

}
