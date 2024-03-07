package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class myStack<E> {

    private final ArrayList<E> delegate;

    public myStack() {
        delegate = new ArrayList<>();
    }

    public void push(E e){
        delegate.add(e);

    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = delegate.get(getSize() - 1);
        delegate.remove(getSize() -1);
        return e;
    }

    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    public int getSize() {
        return delegate.size();
    }
}
