package org.example;

import java.io.*;

public class ExamplePipeline1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\BelajarJava\\TaskPipeline\\src\\main\\java\\org\\example\\input.txt"));
            BufferedWriter outputWriter = new BufferedWriter(new FileWriter("D:\\BelajarJava\\TaskPipeline\\src\\main\\java\\org\\example\\output.txt"));
            String line;

            while ((line = reader.readLine()) != null){
                String[] lines = line.split("\\|");
                for (String word : lines){
                    outputWriter.write(word + "\n");
                }
            }

            reader.close();
            outputWriter.close();
            System.out.println("Selesai");
        }catch (IOException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);
    }
}
