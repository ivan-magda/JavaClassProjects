package com.vanyaland;

public class MutableStringArray {
    private String[] arrayHolder;
    private int numberOfAddedStrings;

    MutableStringArray() {
        arrayHolder = new String[10];
        numberOfAddedStrings = 0;
    }

    MutableStringArray(int size) {
        arrayHolder = new String[size];
        numberOfAddedStrings = 0;
    }

    void addString(String string) {
        if (numberOfAddedStrings < arrayHolder.length) {
            arrayHolder[numberOfAddedStrings++] = string;
        } else {
            String[] tempArr = new String[arrayHolder.length + 1];
            for (int i = 0; i < arrayHolder.length; i++) {
                tempArr[i] = arrayHolder[i];
            }
            tempArr[numberOfAddedStrings++] = string;

            arrayHolder = tempArr;
        }
    }

    public void reverseStrings() {
        String[] tempArr = new String[arrayHolder.length];
        int write = 0;
        int read = arrayHolder.length - 1;
        while (read >= 0) {
            tempArr[write++] = arrayHolder[read--];
        }
        arrayHolder = tempArr;
    }

    public String getStringAtIndex(int index) {
        if (index < arrayHolder.length) {
            return arrayHolder[index];
        } else {
            return null;
        }
    }

    public int size() {
        return arrayHolder.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrayHolder.length; i++) {
            stringBuilder.append(arrayHolder[i]);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}