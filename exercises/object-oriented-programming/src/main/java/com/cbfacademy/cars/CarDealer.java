package com.cbfacademy.cars;

public class CarDealer {

    public static void main(String[] args) {
        Car volvo = new Car("Volvo", "V40", "2012");
        Car porsche = new Car("Porsche", "Panama", "2009");
        Car audi = new Car("Audi", "A3", "2008");

        System.out.println(porsche.getYear());


    }
}
