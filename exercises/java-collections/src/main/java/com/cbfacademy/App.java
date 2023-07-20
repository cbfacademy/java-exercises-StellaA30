package com.cbfacademy;

public class App {
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
        Integer[] integerElements = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println(integerElements[4]);

        Float[] floats = {1.24f, 3.145f, 6.2f, 3.33f, 8.5f, 9.6f, 10.2f, 15.6f, 0.5f, 0.9f, 7.6f, 9.99f};
        System.out.println(floats[4]);

        Double[] doubles = {10.2, 0.5, 1.24, 3.1456, 5.58};
        System.out.println(doubles[4]);

        Boolean[] booleans = {false, true, true, false, true};
        System.out.println(booleans[4]);


        // creating a matrix with the 4 arrays created above
        Object[][] matrix = new Object[4][];
        matrix[0] = integerElements;
        matrix[1] = floats;
        matrix[2] = doubles;
        matrix[3] = booleans;

        System.out.println(matrix[0][4]);
        System.out.println(matrix[1][4]);
        System.out.println(matrix[2][4]);
        System.out.println(matrix[3][4]);



    }
}
