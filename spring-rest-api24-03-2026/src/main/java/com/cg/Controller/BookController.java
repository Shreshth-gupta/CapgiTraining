package com.cg.Controller;

import com.cg.entity.Books;
import com.cg.entity.UserBean;
import com.cg.service.BookService;
import com.cg.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService service;
    @Autowired
    private LoginService Lserver;
    @PostMapping
    public ResponseEntity<String> login(@RequestBody UserBean b, HttpSession s){
        if(s.getAttribute("name")!=null){
            UserBean res=Lserver.validateUser(b);
            if(res!=null) {
                s.setAttribute("name", res.getName());
                return new ResponseEntity<>("User Logined", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Not validated",HttpStatus.UNAUTHORIZED);
    }
    @GetMapping
    public ResponseEntity<List<Books>> getAll(){
        List<Books> b=service.getBookAll();
        return new ResponseEntity<>(b,HttpStatus.OK);
    }
    
}
