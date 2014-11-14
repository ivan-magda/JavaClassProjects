package com.vanyaland;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"First", "Second", "Third", "Forth", "Fifth", "Test"};
	MyLinkedList linkedList = new MyLinkedList(strings);

        linkedList.addFirst("Test");
        System.out.println("Number of elements = " + linkedList.getNumberOfElements());
        System.out.println(linkedList);

        MyLinkedListIterator linkedListIterator = new MyLinkedListIterator(linkedList);

        int numberOfEqualsStrings = 0;
        String stringToFind = "Test";
        while (linkedListIterator.hasNext()) {
            String currentString = (String)linkedListIterator.next();
            if (currentString.equals(stringToFind)) {
                numberOfEqualsStrings++;
            }
        }
        System.out.println("Number of equals strings = " + numberOfEqualsStrings);
    }
}