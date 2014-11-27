package com.vanyaland;

public class MyLinkedList {

        //ListElement class represent element of linked list
    static class ListElement {
        String value;
        ListElement nextElement;

        public ListElement(String stringValue, ListElement listElement) {
            value = stringValue;
            nextElement = listElement;
        }
    }

    int numberOfElements = 0;
    ListElement firstElement = null;
    ListElement lastElement  = null;

        //Constructors
    public MyLinkedList() {}

    public MyLinkedList(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            addLast(strings[i]);
        }
    }

        //Control elements
    public void addFirst(String stringValue) {
        ListElement newElement = new ListElement(stringValue, firstElement);
        if (firstElement == null) {
            lastElement = newElement;
        }
        firstElement = newElement;
        numberOfElements++;
    }

    public void addLast(String stringValue) {
        ListElement newElement = new ListElement(stringValue, null);
        if (lastElement == null) {
            firstElement = newElement;
        } else {
            lastElement.nextElement = newElement;
        }
        lastElement = newElement;
        numberOfElements++;
    }

    public void removeFirst() {
        firstElement = firstElement.nextElement;
        numberOfElements--;
    }

    public int getNumberOfElements() { return numberOfElements; }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(5);
        for (ListElement element = firstElement; element != null; element = element.nextElement) {
            if (element.nextElement != null) {
                stringBuilder.append("(" + element.value + ")->");
            } else {
                stringBuilder.append("(" + element.value + ")");
            }
        }
        return stringBuilder.toString();
    }
}