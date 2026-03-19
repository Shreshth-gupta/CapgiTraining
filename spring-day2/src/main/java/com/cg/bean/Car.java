package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// same thing use only to document
//@Service
//@Repository
@Component
public class Car {
    @Value("${carname}") //SPEL(spring express language
    private String name;
    @Autowired
    @Qualifier("petrolEngine")
    private IEngine Engine;
    @Autowired
    @Qualifier("JKTyre")
    private ITyre tyre;

    Car() {

    }

    public Car(PetrolEngine Engine, MrfTyre tyre) {
        this.Engine = Engine;
        this.tyre = tyre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(IEngine Engine) {
        this.Engine = Engine;
    }

    public void setTyre(ITyre tyre) {
        this.tyre = tyre;
    }

    public String getName() {
        return name;
    }

    public IEngine getEngine() {
        return Engine;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void printCar() {
        System.out.println("Car name: " + name);
        System.out.println("Car Engine: " + Engine.getBHP());
        System.out.println("Car Tyre: " + tyre.getTyreDetails());
    }
}
