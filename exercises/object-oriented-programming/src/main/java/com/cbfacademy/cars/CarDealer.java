package com.cbfacademy.cars;

public class CarDealer {

    public static void main(String[] args) {
        Car volvo = new Car("Volvo", "V40", 2012);
        Car porsche = new Car("Porsche", "Panama", 2009);
        Car audi = new Car("Audi", "A3", 2008);

        System.out.println(porsche.getMake());
        System.out.println(volvo.getYear());
        System.out.println(audi.getModel());

        // calls the override toString method to get a string representation of the class attributes
        System.out.println(volvo);
        System.out.println(porsche);
        System.out.println(audi);
    }
}
