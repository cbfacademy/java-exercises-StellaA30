package com.cbfacademy.shapes;

public class Sphere extends Shape {

    private double radius;

    public Sphere(String shapeName, double radius){
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double area(){
        return 4*Math.PI*(radius*radius);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
