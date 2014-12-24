package com.vanyaland;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

public class LGraph {
    static class Arc {
        int end; // номер узла, в который входит эта дуга
        public Arc(int end) {
            this.end = end;
        }
    }

    ObjectList[] graph; // массив списков дуг

    public LGraph(int n) {
        graph = new ObjectList[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ObjectList();
        }
    }
}
