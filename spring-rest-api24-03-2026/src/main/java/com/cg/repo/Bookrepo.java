package com.cg.repo;

import com.cg.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepo extends JpaRepository<Books,Integer> {
}
