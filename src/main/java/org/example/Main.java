package org.example;

public class Main {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");

        Component composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        composite.display();
    }
}