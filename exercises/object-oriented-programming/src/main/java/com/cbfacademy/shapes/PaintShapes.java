package com.cbfacademy.shapes;

public class PaintShapes {
    public static void main(String[] args) {

        Paint paint = new Paint(500);
        Rectangle deck = new Rectangle("rectangle", 35, 20);
        Sphere ball = new Sphere("ball", 15);
        Cylinder tank = new Cylinder("tank", 30, 10);

        double totalPaintNeeded = paint.amount(deck) + paint.amount(ball) + paint.amount(tank);

        System.out.println(totalPaintNeeded);

    }
}
