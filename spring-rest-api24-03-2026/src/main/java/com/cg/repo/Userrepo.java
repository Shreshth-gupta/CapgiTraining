package com.cg.repo;

import com.cg.entity.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepo extends JpaRepository<UserBean,Integer> {
}
