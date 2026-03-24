package com.cg.entity;

public class UserBean {
    private int userId;
    private String name;
    private String location;

    public UserBean() {
    }

    public UserBean(int userId, String name, String location) {
        this.userId = userId;
        this.name = name;
        this.location = location;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
