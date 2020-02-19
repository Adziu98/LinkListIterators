package com.piechowicz.adam2;

public class ListaIterable<E> {
    private E currentNode;
    private ListaIterable<E> nextNode;

    public ListaIterable() {
        this(null, null);
    }

    public ListaIterable(E currentNode, ListaIterable<E> nextNode) {
        this.currentNode = currentNode;
        this.nextNode = nextNode;
    }

    public ListaIterable<E> pobierzNastepny() {
        return nextNode;
    }

    public E pobierzObiekt() {
        return currentNode;
    }

}
