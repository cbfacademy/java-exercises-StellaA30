package com.cbfacademy.shapes;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String shapeName, double length, double width){
        super(shapeName);
        this.length = length;
        this.width = width;
    }


    @Override
    public double area(){
        return length*width;
    }


    // getters and setters

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
