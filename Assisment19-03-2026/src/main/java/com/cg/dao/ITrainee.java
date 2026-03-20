package com.cg.dao;

import com.cg.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITrainee extends JpaRepository<Trainee,Integer> {
    public List<Trainee> findByTraineeName(String name);
}
