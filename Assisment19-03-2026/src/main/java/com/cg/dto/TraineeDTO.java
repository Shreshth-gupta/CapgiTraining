package com.cg.dto;

public class TraineeDTO {
    private int traineeDtoId;
    private String traineeDtoName;
    private String traineeDtoDomain;
    private String traineeDtoLocation;

    public TraineeDTO() {
    }

    public TraineeDTO(int traineeDtoId, String traineeDtoName, String traineeDtoDomain, String traineeDtoLocation) {
        this.traineeDtoId = traineeDtoId;
        this.traineeDtoName = traineeDtoName;
        this.traineeDtoDomain = traineeDtoDomain;
        this.traineeDtoLocation = traineeDtoLocation;
    }

    public int getTraineeDtoId() {
        return traineeDtoId;
    }

    public void setTraineeDtoId(int traineeDtoId) {
        this.traineeDtoId = traineeDtoId;
    }

    public String getTraineeDtoName() {
        return traineeDtoName;
    }

    public void setTraineeDtoName(String traineeDtoName) {
        this.traineeDtoName = traineeDtoName;
    }

    public String getTraineeDtoDomain() {
        return traineeDtoDomain;
    }

    public void setTraineeDtoDomain(String traineeDtoDomain) {
        this.traineeDtoDomain = traineeDtoDomain;
    }

    public String getTraineeDtoLocation() {
        return traineeDtoLocation;
    }

    public void setTraineeDtoLocation(String traineeDtoLocation) {
        this.traineeDtoLocation = traineeDtoLocation;
    }
}
