package com.cbfacademy;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class App {


    public static void main(String[] args) {

        String filePath = "/Users/stellaannor/Documents/Coding_Black_Females/java-exercises-StellaA30/exercises/input-output/src/main/resources/exercise.txt";
        try (
                FileInputStream file = new FileInputStream(filePath);
                InputStreamReader streamReader = new InputStreamReader(file);
                LineNumberReader lineReader = new LineNumberReader(streamReader);
        ) {
                    String outputLine = lineReader.readLine();
                    while (outputLine != null ){

                        // if statement to skip empty lines
                        if(!outputLine.isEmpty()){
                            System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
                        }
//                        System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
                        outputLine = lineReader.readLine();
                    }
        } catch (IOException e){
            System.out.println("File reading exception: " + e.getMessage());
        }
    }




}
