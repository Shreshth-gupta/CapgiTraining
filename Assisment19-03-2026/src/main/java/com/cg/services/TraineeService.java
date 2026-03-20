package com.cg.services;

import com.cg.dao.ITrainee;
import com.cg.dto.EntityMapper;
import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TraineeService implements ITraineeService {
    @Autowired
    private ITrainee repo;

    @Override
    public List<Trainee> getAll() {
        return repo.findAll();
    }

    @Override
    public TraineeDTO createTrainee(TraineeDTO t) {
        repo.save(EntityMapper.convertDtoToEntity(t));
        return t;
    }

    @Override
    public TraineeDTO getTraineeById(int tid) {
        Trainee t=repo.findById(tid).get();
        if (t!=null)
            return EntityMapper.convertEntityToDto(t);
        else
            return null;
    }

    @Override
    public String removeTrainee(int tid) {
        if (repo.findById(tid).isPresent()) {
            repo.deleteById(tid);
            return "Trainee deleted " + tid;
        }else
            return "No Such Trainee With id: "+tid;
    }

    @Override
    public TraineeDTO updateTrainee( int id , TraineeDTO trainee) {
        Trainee t = repo.findById(id).orElse(null);

        if(trainee.getTraineeDtoName() != null) {
            t.setTraineeName(trainee.getTraineeDtoName());
        }
        if(trainee.getTraineeDtoLocation() != null) {
            t.setTraineeLocation(trainee.getTraineeDtoLocation());
        }
        if(trainee.getTraineeDtoDomain() != null) {
            t.setTraineeDomain(trainee.getTraineeDtoDomain());
        }

        Trainee res = repo.saveAndFlush(t);
        TraineeDTO dto = EntityMapper.convertEntityToDto(res);
        dto.setTraineeDtoId(t.getTraineeId());

        return dto;

    }

    @Override
    public List<TraineeDTO> getTraineeByName(String name) {
        List<Trainee>trainee=repo.findByTraineeName(name);
        List<TraineeDTO> traineeDto=new ArrayList<TraineeDTO>();
        trainee.forEach(t->traineeDto.add(EntityMapper.convertEntityToDto(t)));
        return traineeDto;
    }
}
