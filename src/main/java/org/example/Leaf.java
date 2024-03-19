package org.example;

class Leaf extends BaseComponent {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public short display() {
        System.out.println("Leaf: " + name);
        return 0;
    }
}
