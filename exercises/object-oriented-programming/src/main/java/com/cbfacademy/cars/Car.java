package com.cbfacademy.cars;

public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return make + " " + model + " (" + year + ")";
    }



}
