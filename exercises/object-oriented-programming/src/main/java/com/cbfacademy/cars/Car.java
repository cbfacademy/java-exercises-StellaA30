package com.cbfacademy.cars;

public class Car {
    String make;
    String model;
    String year;

    public Car(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}
