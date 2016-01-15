package com.vanyaland;

import java.io.IOException;

public class Main {
    static final int MAXGEN = 10000; // maximum words generated
    public static void main(String[] args) throws IOException
    {
        Chain chain = new Chain();
        int nwords = MAXGEN;

        chain.build();
        chain.generate(nwords);
    }
}
