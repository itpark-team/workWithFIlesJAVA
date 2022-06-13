package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int arraySize = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        bufferedReader.close();
        fileReader.close();

        Arrays.sort(array);

        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(Integer.toString(array.length));
        bufferedWriter.newLine();

        for (int i = 0; i < array.length; i++) {
            bufferedWriter.write(Integer.toString(array[i]));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();
    }
}
