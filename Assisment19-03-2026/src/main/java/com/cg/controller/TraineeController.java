package com.cg.controller;

import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;
import com.cg.services.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("trainee")
public class TraineeController {
    @Autowired
    private ITraineeService service;
    public TraineeController(ITraineeService service){
        super();
        this.service=service;
    }

    @GetMapping
    public List<Trainee> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TraineeDTO getById(@PathVariable int id){
        return service.getTraineeById(id);
    }

    @PostMapping
    public TraineeDTO createTrainee(@RequestBody TraineeDTO t){
        return service.createTrainee(t);
    }
    @DeleteMapping("/{id}")
    public String removeTeainee(@PathVariable int id){
        return service.removeTrainee(id);
    }
    @PutMapping("/{id}")
    public TraineeDTO upadteTrainee(@PathVariable int id,@RequestBody TraineeDTO t){
        return service.updateTrainee(id,t);
    }
    @GetMapping("/{name}")
    public List<TraineeDTO> getByName(@PathVariable String name){
        return service.getTraineeByName(name);
    }
}
