package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Composite extends BaseComponent {
    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public short display() {
        System.out.println("Composite:");
        for (Component component : children) {
            component.display();
        }
        return 0;
    }

    public Collection<Object> getChildren() {
        return null;
    }
}