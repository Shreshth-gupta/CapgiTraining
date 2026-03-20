package com.cg.services;

import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;

import java.util.List;

public interface ITraineeService {
    List<Trainee> getAll();
    TraineeDTO createTrainee(TraineeDTO t);
    TraineeDTO getTraineeById(int tid);
    String removeTrainee(int tid);
    TraineeDTO updateTrainee(int id,TraineeDTO t);
    List<TraineeDTO> getTraineeByName(String name);
}
