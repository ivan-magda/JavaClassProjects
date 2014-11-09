package com.vanyaland;

public class CharsToIndexes {
    public static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static int[] charsToNumbers(String str) {
        int[] array = new int[str.length()];
        int pos = 0;

        for (char c : str.toCharArray()) {
            int indexOf = alphabet.indexOf(c);
            if (indexOf < 0)
                throw (new IllegalArgumentException());
            array[pos++] = indexOf;
        }
        return array;
    }
}