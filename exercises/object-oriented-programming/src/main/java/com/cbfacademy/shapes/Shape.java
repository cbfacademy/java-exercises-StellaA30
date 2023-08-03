package com.cbfacademy.shapes;

public abstract class Shape {

    private String shapeName;

    public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    // abstract method
    public abstract double area();

    public String toString(){
        return this.shapeName;
    }


// getters and setters
    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
