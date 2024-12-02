package com.cbfacademy.shapes;

public class Paint {

    private double coverage;

    public Paint(double coverage){
        this.coverage = coverage;
    }

    // TBC
    public double amount(Shape shape){
        return shape.area()*coverage;
    }



    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }
}
