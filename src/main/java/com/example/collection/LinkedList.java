package com.example.collection;

public class LinkedList<E> implements List<E> {

    private final Node<E> head;
    private int size;

    public LinkedList(){
        this.head = new Node<>(null);
        this.head.next = this.head.prev = this.head;
        this.size = 0;
    }

    @Override
    public void addItem(E item) {
        Node<E> newest = new Node<>(item);
        newest.next = head;
        newest.prev = head.prev;

        newest.prev.next = newest;
        newest.next.prev = newest;

        size++;
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
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Wrong argument value");
        }
        if (index == 0 && size == 0){
            throw new IllegalArgumentException("List is empty");
        }

        Node<E> node = head;
        if (index < (size / 2)){
            for (int i = 0; i <= index; i++){
                node = node.next;
            }
           deleteItem(node);
        }
        else {
            for (int i = size; i > index; i--){
                node = node.prev;
            }
            deleteItem(node);
        }
    }

    private void deleteItem(Node<E> node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
        size--;
    }

    private class Node<E>{
        private Node<E> prev;
        private Node<E> next;
        private final E value;

        public Node(E value) {
            this.prev = null;
            this.next = null;
            this.value = value;
        }
    }
}
