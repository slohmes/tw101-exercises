package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        left = right = null;
    }

    public void add(String nameOfNewNode) {

        if (nameOfNewNode.compareTo(name) < 0) {// nameOfNewNode is earlier in the alphabet than this.name
            if (left == null) {
                left = new Node(nameOfNewNode);
                return;
            }
            left.add(nameOfNewNode);
        }
        else {
            if (right == null) {
                right = new Node(nameOfNewNode);
                return;
            }
            right.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> namesList = new ArrayList<>();

        if (left == null && right == null) {
            namesList.add(name);
            return namesList;
        }

        if (left != null) namesList = left.names();
        namesList.add(name);
        if (right != null) namesList.addAll(right.names());
        return namesList;
    }
}
