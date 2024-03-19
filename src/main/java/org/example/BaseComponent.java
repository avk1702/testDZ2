package org.example;

class BaseComponent implements Component {
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public short display() {
        throw new UnsupportedOperationException();
    }
}

