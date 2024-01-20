package DesignPatterns;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GenericLinkedList<T> implements GenericList<T> {
    ListNode<T> root;
    ListNode<T> tail;
    ListNode<T> iterator;
    public GenericLinkedList() {
        this.root = null;
    }

    public GenericLinkedList(ListNode<T> root) {
        this.root = root;
    }


    @Override
    public void add(T value) {

        ListNode<T> nodeToAdd = new ListNode<>(value);

        if (root == null) {
            root = nodeToAdd;
            tail = root;
            iterator=tail;
        } else {
            tail.next = nodeToAdd;
            tail = tail.next;
        }


    }

    @Override
    public void remove(T value) {

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }


    private class LinkedListIterator implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return iterator != null;
        }

        @Override
        public T next() {
            T next = null;
            if (hasNext()) {
                next = iterator.value;
                iterator = iterator.next;
            }

            return next;
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {

        }


    }
}
