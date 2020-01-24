package com.company;

public class Car {
    public String name;
    private int maxSpeed;
    public Engine RodzajSilnik = new Engine();

    public void nazwaCar(){
        System.out.println(name);
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
}
