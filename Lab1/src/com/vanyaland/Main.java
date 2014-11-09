package com.vanyaland;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter string: ");
            String str = scanner.nextLine();

            if (str.isEmpty())
                break;

            try {
                System.out.print("Codes: ");

                for (int i : CharsToIndexes.charsToNumbers(str)) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            catch (IllegalArgumentException iae) {
                System.out.println("The string must contain only lowercase letters Russian!");
            }
        }
    }
}