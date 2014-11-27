package com.vanyaland;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.addNodeToLeft(tree.root());
        tree.addNodeToRight(tree.root());

        tree.addNodeToLeft(tree.root().left());
        tree.addNodeToRight(tree.root().right());

        tree.addNodeToRight(tree.root().left());
        tree.addNodeToLeft(tree.root().right());

        tree.addNodeToRight(tree.root().right().right());

        System.out.println("Height of the tree = " + tree.height());
    }
}