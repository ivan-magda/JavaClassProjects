package com.vanyaland;

import java.io.*;

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

            //Add all text lines to the mutableStringArray
        MutableStringArray mutableStringArray = new MutableStringArray();
        String readLine = new String();
        while (readLine != null) {
            try {
                readLine = bufferedReader.readLine();
                if (readLine != null) {
                    mutableStringArray.addString(readLine);
                }
            } catch (IOException exception) {
                System.out.println("Error occurs");
            }
        }
            //Close file
        try {
            bufferedReader.close();
        } catch (IOException exception) {
            System.out.println("Can't close the file!");
        }
        System.out.println("Size of array = " + mutableStringArray.size() + "\n" + mutableStringArray);

            //Reverse strings at the muatableStringArray
        mutableStringArray.reverseStrings();


            //Create PrintWriter object
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("out.txt");
        } catch (IOException exception) {
            System.out.println("Can't creates a new PrintWriter!");
            return;
        }

            //Write String objects to the out.txt
        for (int i = 0; i < mutableStringArray.size(); i++) {
            printWriter.print(mutableStringArray.getStringAtIndex(i));
            printWriter.print("\n");
        }
        printWriter.close();
    }
}