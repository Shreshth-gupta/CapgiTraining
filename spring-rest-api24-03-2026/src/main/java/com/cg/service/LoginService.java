package com.cg.service;

import com.cg.entity.UserBean;
import com.cg.repo.Userrepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class LoginService {
    @Autowired
    private Userrepo repo;

    public LoginService(Userrepo repo) {
        this.repo = repo;
    }

    public UserBean validateUser(UserBean u){
        Optional<UserBean> op=repo.findById(u.getUserId());
        if (op.isPresent())
            return op.get();
        else
            return null;
    }
}
