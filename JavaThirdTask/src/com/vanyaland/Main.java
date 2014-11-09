package com.vanyaland;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
            //Create BufferedReader object
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("in.txt"));
        } catch (FileNotFoundException exception) {
            System.out.println("Can't open file!");
            return;
        }

            //Calculate the number of lines to read
        int numberOfStringsToRead = 0;
        try {
            String readLine = null;
            try {
                readLine = bufferedReader.readLine();
            }
            catch(IOException exception) {
                System.out.println("Can't read line!");
                return;
            }
            numberOfStringsToRead = Integer.valueOf(readLine).intValue();
        } catch (NumberFormatException formatException) {
            System.out.println("Incorrect input value of lines to read!");
            return;
        }
        System.out.println("Number lines to read is " + numberOfStringsToRead);
        System.out.println();

            //Read lines to arrayOfStrings
        String[] arrayOfStrings = new String[numberOfStringsToRead];
        for (int i = 0; i < numberOfStringsToRead; i++) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    arrayOfStrings[i] = readLine;
                } else {
                    System.out.println("You enter incorrect number of lines to read!");
                    break;
                }
            } catch (IOException exception) {
                System.out.println("Can't read line!");
            }
        }

        try {
            bufferedReader.close();
        } catch (IOException exception) {
            System.out.println("Can't close the file!");
        }

            //Print all lines from the end to the beginning
        for (int i = arrayOfStrings.length - 1; i > 0; i--) {
            System.out.println(arrayOfStrings[i]);
        }
    }
}