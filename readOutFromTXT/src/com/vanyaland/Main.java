package com.vanyaland;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        PrintWriter writer = null;

        FileInputStream fileStream = null;
        DataInputStream inStream = null;
        try {
            fileStream = new FileInputStream("in.txt");
            inStream = new DataInputStream(fileStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Create reader
        try {
            reader = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // Create writer
        try {
            writer = new PrintWriter("out.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Scanner for reading from console
        Scanner scanner = new Scanner(System.in);

        // Next reading line
        String readLine = new String();

        while (readLine != null) {
            // Read line from "in.txt"
            try {
                readLine = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (readLine == null) {
                break;
            }

            // Read answer from console
            System.out.println(readLine);
            String answer = scanner.nextLine();
            if (answer.isEmpty()) {
                break;
            }

            // Out to "out.txt"
            writer.print("Вопрос: " + readLine + "\n");
            writer.print("Ответ: " + answer + "\n");
        }

        // Close reader and writer
        writer.close();

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
