package com.vanyaland;

public interface IntegerArrayIterator {
        //Returns true if the iteration has more elements.
    boolean hasNext();

        //Returns the next element in the iteration.
    int next();

        //Returns the iterator to initial state
    void initialState();
}
