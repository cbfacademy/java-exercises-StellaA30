package com.cbfacademy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        StringExercises stringExercises = new StringExercises();

        // exercise 1 test
        char[] characters = {'A', 'B', 'C', 'D'};
        String newString = stringExercises.fromCharacters(characters);
        System.out.println(newString);

        float operand1 = 12.0f;
        float operand2 = 20.0f;

        ArithmeticExercise arithmeticExercise = new ArithmeticExercise();

        System.out.println(arithmeticExercise.addFloat(operand1, operand2));
        System.out.println(arithmeticExercise.subtractFloat(operand1, operand2));
        System.out.println(arithmeticExercise.multiplyFloat(operand1, operand2));
        System.out.println(arithmeticExercise.divideFloat(operand1, operand2));

    }
}
