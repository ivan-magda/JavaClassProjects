package com.vanyaland;

public class Main {

    public static void main(String[] args) {
            //Creating MutableIntegerArrayIterator with other int array
        System.out.println("Creating MutableIntegerArrayIterator with other int array");
        int array[] = {1, 2, 3, 10, 22, 29};
        MutableIntegerArrayIterator mutableIntegerArray = new MutableIntegerArrayIterator(array, 6);
        System.out.println(mutableIntegerArray);

            //Add elements to array
        System.out.println("Add elements to array");
        for (int i = 0; i < 5; i++) {
            mutableIntegerArray.addElement((i + 1) * 5);
        }
        System.out.println(mutableIntegerArray);

            //Adding elements at indexes
        System.out.println("Adding elements at indexes");
        mutableIntegerArray.addElementAtIndex(43, 5);
        System.out.println(mutableIntegerArray);

        mutableIntegerArray.addElementAtIndex(12, 0);
        System.out.println(mutableIntegerArray);

            //Calculate amount of all elements
        int amount = 0;
        while (mutableIntegerArray.hasNext()) {
            amount += mutableIntegerArray.next();
        }
        mutableIntegerArray.initialState();
        System.out.println("Amount of all elements = " + amount);
    }
}