package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class myStack<E> extends ArrayList<E> {

    private final ArrayList<E> deligate;

    public myStack() {
        this.deligate = new ArrayList<>();
    }

    public void push(E e){
        deligate.add(e);

    }

    public E pop() {
        if (deligate.isEmpty()) throw new EmptyStackException();
        E e = deligate.get(deligate.size() - 1);
        deligate.remove(deligate.size() -1);
        return e;
    }
}
