package com.cbfacademy;

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


    }
}
