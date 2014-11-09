package com.vanyaland;

import java.util.NoSuchElementException;

public class MutableIntegerArrayIterator implements IntegerArrayIterator {
    private int arrayHolder[];
    private int size;

        //Instance variables for IntegerArrayIterator interface
    private int next;
    private int hasNext;

    public MutableIntegerArrayIterator(int sizeOfArray) {
        size = sizeOfArray;
        arrayHolder = new int[size];
    }

    public MutableIntegerArrayIterator(int[] arrayOfIntegerElements, int sizeOfArray) {
        size = sizeOfArray;
        arrayHolder = arrayOfIntegerElements;
    }

    public int length() {
        return size;
    }

    public int elementAtIndex(int index) {
        if (index <= size && index >= 0) {
            return arrayHolder[index];
        } else {
            throw (new IllegalArgumentException());
        }
    }

    public void addElement(int element) {
        ++size;
        int temporaryArray[] = new int[size];
        for (int i = 0; i < size - 1; i++) {
            temporaryArray[i] = arrayHolder[i];
        }
        temporaryArray[size - 1] = element;
        arrayHolder = temporaryArray;
    }

    public void addElementAtIndex(int element, int index) {
        if (index > size) {
            size = index + 1;
            int temporaryArray[] = new int[size];
            for (int i = 0; i < size - 1; i++) {
                temporaryArray[i] = arrayHolder[i];
            }
            temporaryArray[size - 1] = element;

            arrayHolder = temporaryArray;
        } else {
            ++size;
            int temporaryArray[] = new int[size];
            for (int i = 0; i < index; i++) {
                temporaryArray[i] = arrayHolder[i];
            }
            temporaryArray[index] = element;

            int read = index;
            for (int write = index + 1; write < size; ++write, ++read) {
                temporaryArray[write] = arrayHolder[read];
            }
            arrayHolder = temporaryArray;
        }
    }

    @Override
    public boolean hasNext() {
        if (hasNext++ < size) {
            return true;
        }
        return false;
    }

    @Override
    public int next() {
        if (next < size) {
            return arrayHolder[next++];
        } else {
            throw(new NoSuchElementException());
        }
    }

    @Override
    public void initialState() {
        hasNext = 0;
        next = 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            stringBuilder.append(arrayHolder[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}