package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComponentTest {


    @Test
    public void testBaseComponentAdd() {
        BaseComponent baseComponent = new BaseComponent();
        assertThrows(UnsupportedOperationException.class, () -> {
            baseComponent.add(new Leaf("Test Leaf"));
        });
    }

    @Test
    public void testBaseComponentRemove() {
        BaseComponent baseComponent = new BaseComponent();
        assertThrows(UnsupportedOperationException.class, () -> {
            baseComponent.remove(new Leaf("Test Leaf"));
        });
    }

    @Test
    public void testBaseComponentDisplay() {
        BaseComponent baseComponent = new BaseComponent();
        assertThrows(UnsupportedOperationException.class, () -> {
            baseComponent.display();
        });
    }
}