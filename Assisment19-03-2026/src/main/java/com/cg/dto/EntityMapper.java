package com.cg.dto;

import com.cg.entity.Trainee;

public class EntityMapper {
    public static Trainee convertDtoToEntity(TraineeDTO tdto) {
        return new Trainee(tdto.getTraineeDtoName(),tdto.getTraineeDtoDomain(),tdto.getTraineeDtoLocation());
    }

    public static TraineeDTO convertEntityToDto(Trainee tdto) {
        return new TraineeDTO(tdto.getTraineeId(),tdto.getTraineeName(),tdto.getTraineeDomain(),tdto.getTraineeLocation());
    }
}
