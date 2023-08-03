package com.cbfacademy.shapes;

public class Cylinder extends Shape{

    private double height;
    private double radius;

    public Cylinder(String shapeName, double height, double radius){
        super(shapeName);
        this.height = height;
        this.radius = radius;
    }


    @Override
    public double area(){
        return Math.PI*height*(radius*radius);
    }


    //getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }




}
