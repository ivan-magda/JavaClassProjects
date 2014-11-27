package com.vanyaland;

import java.util.Iterator;

public class MyLinkedListIterator implements Iterator {
    private MyLinkedList.ListElement current;

    public MyLinkedListIterator(MyLinkedList linkedList) {
        current = linkedList.firstElement;
    }
    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        } else {
            String string = current.value;
            current = current.nextElement;
            return string;
        }
    }
}