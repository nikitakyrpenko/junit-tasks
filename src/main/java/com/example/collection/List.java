package com.example.collection;

//https://habr.com/ru/users/tarzan82/posts/
public interface List<E> {

    void addItem(E item);

    int size();

    boolean isEmpty();

    void removeItemByIndex(int index);
}
