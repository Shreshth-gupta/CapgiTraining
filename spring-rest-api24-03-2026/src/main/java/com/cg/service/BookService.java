package com.cg.service;

import com.cg.entity.Books;
import com.cg.repo.Bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private Bookrepo repo;

    public Books getBookById(int id){
        return repo.findById(id).get();
    }
    public List<Books>  getBookAll(){
        return repo.findAll();
    }
    public Books createBook(Books b){
        return repo.saveAndFlush(b);
    }
}
