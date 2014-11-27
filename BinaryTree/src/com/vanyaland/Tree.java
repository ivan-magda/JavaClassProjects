package com.vanyaland;

public class Tree {

        //implementation of the Node class
    public static class Node {
        private Object item;
        private Node left = null;
        private Node right = null;

        public Node(Object item) {
            this.item = item;
        }

        public Node(Object item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
        
        public Node left() {
            return this.left;
        }

        public Node right() {
            return this.right;
        }
    }

        //root of the tree
    private Node root = null;

    public Tree() {
        this.root = new Node("root");
    }

    public Node root() {
        return this.root;
    }

    public void addNodeToLeft(Node sourceNode) {
        sourceNode.left = new Node("left");
    }

    public void addNodeToRight(Node sourceNode) {
        sourceNode.right = new Node("right");
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(height(node.left), height(node.right)) + 1;
        }
    }
}