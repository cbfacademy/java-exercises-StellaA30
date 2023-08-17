package com.cbfacademy;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

//                        // if statement to skip empty lines
//                        if(!outputLine.isEmpty()){
//                            System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
//                        }
                        System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
                        outputLine = lineReader.readLine();
                    }
        } catch (IOException e){
            System.out.println("File reading exception: " + e.getMessage());
        }


//        String invertFile = "/Users/stellaannor/Documents/Coding_Black_Females/java-exercises-StellaA30/exercises/input-output/src/main/resources/inverted.txt";

//        try (
//                FileOutputStream fileOutputStream = new FileOutputStream(invertFile);
//                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//        )

//

        String inputFilePath = "/Users/stellaannor/Documents/Coding_Black_Females/java-exercises-StellaA30/exercises/input-output/src/main/resources/exercise.txt";
        String invertFilePath = "/Users/stellaannor/Documents/Coding_Black_Females/java-exercises-StellaA30/exercises/input-output/src/main/resources/inverted.txt";

        try (
                FileInputStream fileInputStream = new FileInputStream(inputFilePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                FileOutputStream fileOutputStream = new FileOutputStream(invertFilePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {

            // create empty list of strings
            List<String> lines = new ArrayList<>();
            String line;

            // Read the content of the exercise.txt file
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            // Write the inverted content to the inverted.txt file
            for (int i = lines.size() - 1; i >= 0; i--) {
                bufferedWriter.write(lines.get(i));
                bufferedWriter.newLine();
            }

            System.out.println("Content inverted and written to " + invertFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }















    }




}
