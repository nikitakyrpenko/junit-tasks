package com.example.collection;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_SIZE = 2;

    private Object[] items;
    private int size;
    private int capacity;

    public ArrayList() {
        this.size = 0;
        this.capacity = DEFAULT_SIZE;
        this.items = new Object[DEFAULT_SIZE];
    }

    @Override
    public void addItem(E item) {
        if (size == capacity - 1) {
            capacity *= 2;
            final Object[] tempItems = new Object[capacity];
            System.arraycopy(items, 0, tempItems, 0, size);
            items = tempItems;
        }
        items[size++] = item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void removeItemByIndex(int index) {
        throw new UnsupportedOperationException();
    }
}
